<!--=========================README TEMPLATE INSTRUCTIONS=============================
======================================================================================

- THIS README TEMPLATE LARGELY CONSISTS OF COMMENTED OUT TEXT. THIS UNRENDERED TEXT IS MEANT TO BE LEFT IN AS A GUIDE 
  THROUGHOUT THE REPOSITORY'S LIFE WHILE END USERS ONLY SEE THE RENDERED PAGE CONTENT. 
- Any italicized text rendered in the initial template is intended to be replaced IMMEDIATELY upon repository creation.

- This template is default but not mandatory. It was designed to compensate for typical gaps in Microsoft READMEs 
  that slow the pace of work. You may delete it if you have a fully populated README to replace it with.

- Most README sections below are commented out as they are not known early in a repository's life. Others are commented 
  out as they do not apply to every repository. If a section will be appropriate later but not known now, consider 
  leaving it in commented out and adding an issue as a reminder.
- There are additional optional README sections in the external instruction link below. These include; "citation",  
  "built with", "acknowledgments", "folder structure", etc.
- You can easily find the places to add content that will be rendered to the end user by searching 
within the file for "TODO".



- ADDITIONAL EXTERNAL TEMPLATE INSTRUCTIONS:
  -  https://aka.ms/StartRight/README-Template/Instructions

======================================================================================
====================================================================================-->


<!---------------------[  Description  ]------------------<recommended> section below------------------>

# azure-beacon

<!-- 
INSTRUCTIONS:
- Write description paragraph(s) that can stand alone. Remember 1st paragraph may be consumed by aggregators to improve 
  search experience.
- You description should allow any reader to figure out:
    1. What it does?
    2. Why was it was created?
    3. Who created?
    4. What is it's maturity?
    5. What is the larger context?
- Write for a reasonable person with zero context regarding your product, org, and team. The person may be evaluating if 
this is something they can use.

How to Evaluate & Examples: 
  - https://aka.ms/StartRight/README-Template/Instructions#description
-->

A G4GH Beacon v2 implementation poc in Azure.

-----------------------------------------------------------------
<!-----------------------[  License  ]----------------------<optional> section below--------------------->

<!-- 
## License 
--> 

<!-- 
INSTRUCTIONS:
- Licensing is mostly irrelevant within the company for purely internal code. Use this section to prevent potential 
  confusion around:
  - Open source in internal code repository.
  - Multiple licensed code in same repository. 
  - Internal fork of public open source code.

How to Evaluate & Examples:
  - https://aka.ms/StartRight/README-Template/Instructions#license
-->

<!---- [TODO]  CONTENT GOES BELOW ------->

<!------====-- CONTENT GOES ABOVE ------->



<!-----------------------[  Getting Started  ]--------------<recommended> section below------------------>
## Getting Started

<!-- 
INSTRUCTIONS:
  - Write instructions such that any new user can get the project up & running on their machine.
  - This section has subsections described further down of "Prerequisites", "Installing", and "Deployment". 

How to Evaluate & Examples:
  - https://aka.ms/StartRight/README-Template/Instructions#getting-started
-->

<!---- [TODO]  CONTENT GOES BELOW ------->
*Description of how to install and use the code or content goes here*
<!------====-- CONTENT GOES ABOVE ------->


<!-----------------------[ Prerequisites  ]-----------------<optional> section below--------------------->
### Prerequisites

<!--------------------------------------------------------
INSTRUCTIONS:
- Describe what things a new user needs to install in order to install and use the repository. 

How to Evaluate & Examples:
  - https://aka.ms/StartRight/README-Template/Instructions#prerequisites
---------------------------------------------------------->

<!---- [TODO]  CONTENT GOES BELOW ------->
1. Docker installed. It is required to run local instance of PostgreSQL database.
2. Java 17 installed.
<!------====-- CONTENT GOES ABOVE ------->


<!-----------------------[  Installing  ]-------------------<optional> section below------------------>
### Installing

<!--
INSTRUCTIONS:
- A step by step series of examples that tell you how to get a development environment and your code running. 
- Best practice is to include examples that can be copy and pasted directly from the README into a terminal.

How to Evaluate & Examples:
  - https://aka.ms/StartRight/README-Template/Instructions#installing

<!---- [TODO]  CONTENT GOES BELOW ------->
This repository does not hold installable content.
<!------====-- CONTENT GOES ABOVE ------->


<!-----------------------[  Tests  ]------------------------<optional> section below--------------------->
<!-- 
## Tests
 -->

<!--
INSTRUCTIONS:
- Explain how to run the tests for this project. You may want to link here from Deployment (CI/CD) or Contributing sections.

How to Evaluate & Examples:
  - https://aka.ms/StartRight/README-Template/Instructions#tests
-->

<!---- [TODO]  CONTENT GOES BELOW ------->
<!--

*Explain what these tests test and why* 

```
Give an example
``` 

-->
<!------====-- CONTENT GOES ABOVE ------->


<!-----------------------[  Deployment (CI/CD)  ]-----------<optional> section below--------------------->
### Deployment (CI/CD)

<!-- 
INSTRUCTIONS:
- Describe how to deploy if applicable. Deployment includes website deployment, packages, or artifacts.
- Avoid potential new contributor frustrations by making it easy to know about all compliance and continuous integration 
    that will be run before pull request approval.
- NOTE: Setting up an Azure DevOps pipeline gets you all 1ES compliance and build tooling such as component governance. 
  - More info: https://aka.ms/StartRight/README-Template/integrate-ado

How to Evaluate & Examples:
  - https://aka.ms/StartRight/README-Template/Instructions#deployment-and-continuous-integration
-->

<!---- [TODO]  CONTENT GOES BELOW ------->
_At this time, the repository does not use continuous integration or produce a website, artifact, or anything deployed._
<!------====-- CONTENT GOES ABOVE ------->


<!-----------------------[  Versioning and Changelog  ]-----<optional> section below--------------------->

<!-- ### Versioning and Changelog -->

<!-- 
INSTRUCTIONS:
- If there is any information on a changelog, history, versioning style, roadmap or any related content tied to the 
  history and/or future of your project, this is a section for it.

How to Evaluate & Examples:
  - https://aka.ms/StartRight/README-Template/Instructions#versioning-and-changelog
-->

<!---- [TODO]  CONTENT GOES BELOW ------->
<!-- We use [SemVer](https://aka.ms/StartRight/README-Template/semver) for versioning. -->
<!------====-- CONTENT GOES ABOVE ------->

### Building the code

```shell
./gradlew clean build
```

### Running PostgreSQL database locally
```shell
./scripts/local-dev/postgres.sh start|stop
```

### Running Beacon API server locally

Prerequisites: Local database instance should be already started.
```shell
./gradlew bootRun
```

-----------------------------------------------

## Contributing

<!--
INSTRUCTIONS: 
- Establish expectations and processes for existing & new developers to contribute to the repository.
  - Describe whether first step should be email, teams message, issue, or direct to pull request.
  - Express whether fork or branch preferred.
- CONTRIBUTING content Location:
  - You can tell users how to contribute in the README directly or link to a separate CONTRIBUTING.md file.
  - The README sections "Contacts" and "Reuse Expectations" can be seen as subsections to CONTRIBUTING.
  
How to Evaluate & Examples:
  - https://aka.ms/StartRight/README-Template/Instructions#contributing
-->

<!---- [TODO]  CONTENT GOES BELOW ------->
_This repository prefers outside contributors start forks rather than branches. For pull requests more complicated 
than typos, it is often best to submit an issue first._

If you are a new potential collaborator who finds reaching out or contributing to another project awkward, you may find 
it useful to read these [tips & tricks](https://aka.ms/StartRight/README-Template/innerSource/2021_02_TipsAndTricksForCollaboration) 
on InnerSource Communication.
<!------====-- CONTENT GOES ABOVE ------->


<!-----------------------[  Contacts  ]---------------------<recommended> section below------------------>
<!-- 
#### Contacts  
-->
<!--
INSTRUCTIONS: 
- To lower friction for new users and contributors, provide a preferred contact(s) and method (email, TEAMS, issue, etc.)

How to Evaluate & Examples:
  - https://aka.ms/StartRight/README-Template/Instructions#contacts
-->

<!---- [TODO]  CONTENT GOES BELOW ------->

<!------====-- CONTENT GOES ABOVE ------->


<!-----------------------[  Support & Reuse Expectations  ]-----<recommended> section below-------------->
 
### Support & Reuse Expectations

 
<!-- 
INSTRUCTIONS:
- To avoid misalignments use this section to set expectations in regards to current and future state of:
  - The level of support the owning team provides new users/contributors and 
  - The owning team's expectations in terms of incoming InnerSource requests and contributions.

How to Evaluate & Examples:
  - https://aka.ms/StartRight/README-Template/Instructions#support-and-reuse-expectations
-->

<!---- [TODO]  CONTENT GOES BELOW ------->

_The creators of this repository **DO NOT EXPECT REUSE**._

If you do use it, please let us know via an email or 
leave a note in an issue, so we can best understand the value of this repository.
<!------====-- CONTENT GOES ABOVE ------->
