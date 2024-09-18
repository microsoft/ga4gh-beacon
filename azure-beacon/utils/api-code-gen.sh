#clone beacon-v2 repo

REPO_URL=https://github.com/ga4gh-beacon/beacon-v2.git
REPO_BRANCH=main
REPO_COMMIT=16862205c79294fae5473f7fa330bf5929b3b120

BEACON_V2_SRC_DIR=.beacon-v2
BEACON_V2_GIT_DIR=beacon-v2

if [ -d $BEACON_V2_SRC_DIR ]; then
  echo "Cleaning up after previous run."
  rm -rf $BEACON_V2_SRC_DIR
fi

mkdir $BEACON_V2_SRC_DIR && cd $BEACON_V2_SRC_DIR

#clone beacon-v2 and checkout specific commit
echo "Cloning beacon-v2 repo into "
git clone $REPO_URL -b $REPO_BRANCH
cd $BEACON_V2_GIT_DIR && git checkout $REPO_REPO_COMMIT

#copy patch into beacon-v2 and apply it
cp ../../utils/repo-changes.patch .
git apply repo-changes.patch

#generate server code for endpoints
DATASETS_PATH=models/src/beacon-v2-default-model/datasets
DATASETS_ENDPOINT_FILENAME=endpoints.yaml
DATASETS_PATH_TO_YAML=$DATASETS_PATH/$DATASETS_ENDPOINT_FILENAME
BEACON_V2_ROOT_PATH=$(pwd)
SERVER_GENERATED_CODE_DIR=.server-generated
echo "Adjust $DATASETS_PATH_TO_YAML file for generation..."

cd $DATASETS_PATH && pwd
echo "Adjust endpoint.yaml to remove absolute references to github."
sed -i -e 's/https:\/\/raw.githubusercontent.com\/ga4gh-beacon\/beacon-v2\/main/..\/..\/..\/..\/../g' $DATASETS_ENDPOINT_FILENAME
cd $BEACON_V2_ROOT_PATH && pwd

mkdir $SERVER_GENERATED_CODE_DIR

openapi-generator-cli generate \
          -i $DATASETS_PATH_TO_YAML \
          -g spring \
          -o $SERVER_GENERATED_CODE_DIR \
          --additional-properties=modelPackage=com.microsoft.beacon.generated.model,apiPackage=com.microsoft.beacon.generated.api,useSpringBoot3=true \
          --skip-validate-spec

#prepare to copy generated code into 'build' folder
#go to the root of azure-beacon
cd ../../build
if [ -d open-api-generated ]; then
  echo "Cleaning up generated code after previous run."
  rm -rf open-api-generated
fi
mkdir open-api-generated && cd ../

echo "Copying generated code into the 'build' folder of azure-beacon."
cp -R .beacon-v2/beacon-v2/.server-generated/src/ build/open-api-generated/