package com.microsoft.beacon.api.db.model;

import java.time.LocalDateTime;

public class Dataset {
  public String Id;
  public String Name;
  public String ExternalUrl;
  public String Description;
  public String Version;
  public String Info;
  public LocalDateTime CreateDateTime;
  public LocalDateTime UpdateDateTime;

  public Dataset(String id, String name, String externalUrl, String description) {
    this.Id = id;
    this.Name = name;
    this.ExternalUrl = externalUrl;
    this.Description = description;
    this.CreateDateTime = LocalDateTime.now();
    this.UpdateDateTime = LocalDateTime.now();
  }

  public String getId() {
    return this.Id;
  }

  public void setId(String id) {
    this.Id = id;
  }

  public String getName() {
    return this.Name;
  }

  public void setName(String name) {
    this.Name = name;
  }

  public String getExternalUrl() {
    return this.ExternalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.ExternalUrl = externalUrl;
  }

  public String getDescription() {
    return this.Description;
  }

  public void setDescription(String description) {
    this.Description = description;
  }

  public String getVersion() {
    return this.Version;
  }

  public void setVersion(String version) {
    this.Version = version;
  }

  public String getInfo() {
    return this.Info;
  }

  public void setInfo(String info) {
    this.Info = info;
  }

  public LocalDateTime getCreateDateTime() {
    return this.CreateDateTime;
  }

  public void setCreateDateTime(LocalDateTime createDateTime) {
    this.CreateDateTime = createDateTime;
  }

  public LocalDateTime getUpdateDateTime() {
    return this.UpdateDateTime;
  }

  public void setUpdateDateTime(LocalDateTime updateDateTime) {
    this.UpdateDateTime = updateDateTime;
  }
}
