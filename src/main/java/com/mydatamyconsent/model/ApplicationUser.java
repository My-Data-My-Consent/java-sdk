/*
 * My Data My Consent - Developer API
 * Unleashing the power of data consent by establishing trust. The Platform Core Developer API defines a set of capabilities that can be used to request, issue, manage and update data, documents and credentials by organizations. The API can be used to request, manage and update Decentralised Identifiers, Financial Data, Health Data issue Documents, Credentials directly or using OpenID Connect flows, and verify Messages signed with DIDs and much more.
 *
 * The version of the OpenAPI document: v1
 * Contact: support@mydatamyconsent.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mydatamyconsent.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mydatamyconsent.model.Country;
import com.mydatamyconsent.model.Gender;
import com.mydatamyconsent.model.RefreshToken;
import com.mydatamyconsent.model.Theme;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * ApplicationUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-26T11:36:08.780773+05:30[Asia/Kolkata]")
public class ApplicationUser {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_USER_NAME = "userName";
  @SerializedName(SERIALIZED_NAME_USER_NAME)
  private String userName;

  public static final String SERIALIZED_NAME_NORMALIZED_USER_NAME = "normalizedUserName";
  @SerializedName(SERIALIZED_NAME_NORMALIZED_USER_NAME)
  private String normalizedUserName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NORMALIZED_EMAIL = "normalizedEmail";
  @SerializedName(SERIALIZED_NAME_NORMALIZED_EMAIL)
  private String normalizedEmail;

  public static final String SERIALIZED_NAME_EMAIL_CONFIRMED = "emailConfirmed";
  @SerializedName(SERIALIZED_NAME_EMAIL_CONFIRMED)
  private Boolean emailConfirmed;

  public static final String SERIALIZED_NAME_PASSWORD_HASH = "passwordHash";
  @SerializedName(SERIALIZED_NAME_PASSWORD_HASH)
  private String passwordHash;

  public static final String SERIALIZED_NAME_SECURITY_STAMP = "securityStamp";
  @SerializedName(SERIALIZED_NAME_SECURITY_STAMP)
  private String securityStamp;

  public static final String SERIALIZED_NAME_CONCURRENCY_STAMP = "concurrencyStamp";
  @SerializedName(SERIALIZED_NAME_CONCURRENCY_STAMP)
  private String concurrencyStamp;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_CONFIRMED = "phoneNumberConfirmed";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_CONFIRMED)
  private Boolean phoneNumberConfirmed;

  public static final String SERIALIZED_NAME_TWO_FACTOR_ENABLED = "twoFactorEnabled";
  @SerializedName(SERIALIZED_NAME_TWO_FACTOR_ENABLED)
  private Boolean twoFactorEnabled;

  public static final String SERIALIZED_NAME_LOCKOUT_END = "lockoutEnd";
  @SerializedName(SERIALIZED_NAME_LOCKOUT_END)
  private OffsetDateTime lockoutEnd;

  public static final String SERIALIZED_NAME_LOCKOUT_ENABLED = "lockoutEnabled";
  @SerializedName(SERIALIZED_NAME_LOCKOUT_ENABLED)
  private Boolean lockoutEnabled;

  public static final String SERIALIZED_NAME_ACCESS_FAILED_COUNT = "accessFailedCount";
  @SerializedName(SERIALIZED_NAME_ACCESS_FAILED_COUNT)
  private Integer accessFailedCount;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_FULL_NAME = "fullName";
  @SerializedName(SERIALIZED_NAME_FULL_NAME)
  private String fullName;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private Gender gender;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private OffsetDateTime dateOfBirth;

  public static final String SERIALIZED_NAME_COUNTRY_ID = "countryId";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ID)
  private UUID countryId;

  public static final String SERIALIZED_NAME_POST_CODE = "postCode";
  @SerializedName(SERIALIZED_NAME_POST_CODE)
  private String postCode;

  public static final String SERIALIZED_NAME_REFERRED_BY = "referredBy";
  @SerializedName(SERIALIZED_NAME_REFERRED_BY)
  private UUID referredBy;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_THEME = "theme";
  @SerializedName(SERIALIZED_NAME_THEME)
  private Theme theme;

  public static final String SERIALIZED_NAME_DESIGNATION = "designation";
  @SerializedName(SERIALIZED_NAME_DESIGNATION)
  private String designation;

  public static final String SERIALIZED_NAME_IS_MARKED_FOR_DELETION = "isMarkedForDeletion";
  @SerializedName(SERIALIZED_NAME_IS_MARKED_FOR_DELETION)
  private Boolean isMarkedForDeletion;

  public static final String SERIALIZED_NAME_HARD_DELETE_DATE = "hardDeleteDate";
  @SerializedName(SERIALIZED_NAME_HARD_DELETE_DATE)
  private OffsetDateTime hardDeleteDate;

  public static final String SERIALIZED_NAME_SECURITY_PIN = "securityPin";
  @SerializedName(SERIALIZED_NAME_SECURITY_PIN)
  private String securityPin;

  public static final String SERIALIZED_NAME_PHOTO_URL = "photoUrl";
  @SerializedName(SERIALIZED_NAME_PHOTO_URL)
  private String photoUrl;

  public static final String SERIALIZED_NAME_REFERRAL_CODE = "referralCode";
  @SerializedName(SERIALIZED_NAME_REFERRAL_CODE)
  private String referralCode;

  public static final String SERIALIZED_NAME_RECOVERY_TOKEN = "recoveryToken";
  @SerializedName(SERIALIZED_NAME_RECOVERY_TOKEN)
  private String recoveryToken;

  public static final String SERIALIZED_NAME_DIGI_LOCKER_LAST_SYNC_DATE = "digiLockerLastSyncDate";
  @SerializedName(SERIALIZED_NAME_DIGI_LOCKER_LAST_SYNC_DATE)
  private OffsetDateTime digiLockerLastSyncDate;

  public static final String SERIALIZED_NAME_REFRESH_TOKENS = "refreshTokens";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKENS)
  private List<RefreshToken> refreshTokens = null;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private Country country;

  public static final String SERIALIZED_NAME_REFERRED_BY_USER = "referredByUser";
  @SerializedName(SERIALIZED_NAME_REFERRED_BY_USER)
  private ApplicationUser referredByUser;


  public ApplicationUser id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public ApplicationUser userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserName() {
    return userName;
  }


  public void setUserName(String userName) {
    this.userName = userName;
  }


  public ApplicationUser normalizedUserName(String normalizedUserName) {
    
    this.normalizedUserName = normalizedUserName;
    return this;
  }

   /**
   * Get normalizedUserName
   * @return normalizedUserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNormalizedUserName() {
    return normalizedUserName;
  }


  public void setNormalizedUserName(String normalizedUserName) {
    this.normalizedUserName = normalizedUserName;
  }


  public ApplicationUser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ApplicationUser normalizedEmail(String normalizedEmail) {
    
    this.normalizedEmail = normalizedEmail;
    return this;
  }

   /**
   * Get normalizedEmail
   * @return normalizedEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNormalizedEmail() {
    return normalizedEmail;
  }


  public void setNormalizedEmail(String normalizedEmail) {
    this.normalizedEmail = normalizedEmail;
  }


  public ApplicationUser emailConfirmed(Boolean emailConfirmed) {
    
    this.emailConfirmed = emailConfirmed;
    return this;
  }

   /**
   * Get emailConfirmed
   * @return emailConfirmed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEmailConfirmed() {
    return emailConfirmed;
  }


  public void setEmailConfirmed(Boolean emailConfirmed) {
    this.emailConfirmed = emailConfirmed;
  }


  public ApplicationUser passwordHash(String passwordHash) {
    
    this.passwordHash = passwordHash;
    return this;
  }

   /**
   * Get passwordHash
   * @return passwordHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPasswordHash() {
    return passwordHash;
  }


  public void setPasswordHash(String passwordHash) {
    this.passwordHash = passwordHash;
  }


  public ApplicationUser securityStamp(String securityStamp) {
    
    this.securityStamp = securityStamp;
    return this;
  }

   /**
   * Get securityStamp
   * @return securityStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecurityStamp() {
    return securityStamp;
  }


  public void setSecurityStamp(String securityStamp) {
    this.securityStamp = securityStamp;
  }


  public ApplicationUser concurrencyStamp(String concurrencyStamp) {
    
    this.concurrencyStamp = concurrencyStamp;
    return this;
  }

   /**
   * Get concurrencyStamp
   * @return concurrencyStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConcurrencyStamp() {
    return concurrencyStamp;
  }


  public void setConcurrencyStamp(String concurrencyStamp) {
    this.concurrencyStamp = concurrencyStamp;
  }


  public ApplicationUser phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public ApplicationUser phoneNumberConfirmed(Boolean phoneNumberConfirmed) {
    
    this.phoneNumberConfirmed = phoneNumberConfirmed;
    return this;
  }

   /**
   * Get phoneNumberConfirmed
   * @return phoneNumberConfirmed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPhoneNumberConfirmed() {
    return phoneNumberConfirmed;
  }


  public void setPhoneNumberConfirmed(Boolean phoneNumberConfirmed) {
    this.phoneNumberConfirmed = phoneNumberConfirmed;
  }


  public ApplicationUser twoFactorEnabled(Boolean twoFactorEnabled) {
    
    this.twoFactorEnabled = twoFactorEnabled;
    return this;
  }

   /**
   * Get twoFactorEnabled
   * @return twoFactorEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTwoFactorEnabled() {
    return twoFactorEnabled;
  }


  public void setTwoFactorEnabled(Boolean twoFactorEnabled) {
    this.twoFactorEnabled = twoFactorEnabled;
  }


  public ApplicationUser lockoutEnd(OffsetDateTime lockoutEnd) {
    
    this.lockoutEnd = lockoutEnd;
    return this;
  }

   /**
   * Get lockoutEnd
   * @return lockoutEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLockoutEnd() {
    return lockoutEnd;
  }


  public void setLockoutEnd(OffsetDateTime lockoutEnd) {
    this.lockoutEnd = lockoutEnd;
  }


  public ApplicationUser lockoutEnabled(Boolean lockoutEnabled) {
    
    this.lockoutEnabled = lockoutEnabled;
    return this;
  }

   /**
   * Get lockoutEnabled
   * @return lockoutEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLockoutEnabled() {
    return lockoutEnabled;
  }


  public void setLockoutEnabled(Boolean lockoutEnabled) {
    this.lockoutEnabled = lockoutEnabled;
  }


  public ApplicationUser accessFailedCount(Integer accessFailedCount) {
    
    this.accessFailedCount = accessFailedCount;
    return this;
  }

   /**
   * Get accessFailedCount
   * @return accessFailedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAccessFailedCount() {
    return accessFailedCount;
  }


  public void setAccessFailedCount(Integer accessFailedCount) {
    this.accessFailedCount = accessFailedCount;
  }


  public ApplicationUser firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ApplicationUser middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public ApplicationUser lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


   /**
   * Get fullName
   * @return fullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFullName() {
    return fullName;
  }




  public ApplicationUser gender(Gender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Gender getGender() {
    return gender;
  }


  public void setGender(Gender gender) {
    this.gender = gender;
  }


  public ApplicationUser dateOfBirth(OffsetDateTime dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(OffsetDateTime dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public ApplicationUser countryId(UUID countryId) {
    
    this.countryId = countryId;
    return this;
  }

   /**
   * Get countryId
   * @return countryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getCountryId() {
    return countryId;
  }


  public void setCountryId(UUID countryId) {
    this.countryId = countryId;
  }


  public ApplicationUser postCode(String postCode) {
    
    this.postCode = postCode;
    return this;
  }

   /**
   * Get postCode
   * @return postCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostCode() {
    return postCode;
  }


  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  public ApplicationUser referredBy(UUID referredBy) {
    
    this.referredBy = referredBy;
    return this;
  }

   /**
   * Get referredBy
   * @return referredBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getReferredBy() {
    return referredBy;
  }


  public void setReferredBy(UUID referredBy) {
    this.referredBy = referredBy;
  }


  public ApplicationUser language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public ApplicationUser theme(Theme theme) {
    
    this.theme = theme;
    return this;
  }

   /**
   * Get theme
   * @return theme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Theme getTheme() {
    return theme;
  }


  public void setTheme(Theme theme) {
    this.theme = theme;
  }


  public ApplicationUser designation(String designation) {
    
    this.designation = designation;
    return this;
  }

   /**
   * Get designation
   * @return designation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDesignation() {
    return designation;
  }


  public void setDesignation(String designation) {
    this.designation = designation;
  }


  public ApplicationUser isMarkedForDeletion(Boolean isMarkedForDeletion) {
    
    this.isMarkedForDeletion = isMarkedForDeletion;
    return this;
  }

   /**
   * Get isMarkedForDeletion
   * @return isMarkedForDeletion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsMarkedForDeletion() {
    return isMarkedForDeletion;
  }


  public void setIsMarkedForDeletion(Boolean isMarkedForDeletion) {
    this.isMarkedForDeletion = isMarkedForDeletion;
  }


  public ApplicationUser hardDeleteDate(OffsetDateTime hardDeleteDate) {
    
    this.hardDeleteDate = hardDeleteDate;
    return this;
  }

   /**
   * Get hardDeleteDate
   * @return hardDeleteDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getHardDeleteDate() {
    return hardDeleteDate;
  }


  public void setHardDeleteDate(OffsetDateTime hardDeleteDate) {
    this.hardDeleteDate = hardDeleteDate;
  }


  public ApplicationUser securityPin(String securityPin) {
    
    this.securityPin = securityPin;
    return this;
  }

   /**
   * Get securityPin
   * @return securityPin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecurityPin() {
    return securityPin;
  }


  public void setSecurityPin(String securityPin) {
    this.securityPin = securityPin;
  }


  public ApplicationUser photoUrl(String photoUrl) {
    
    this.photoUrl = photoUrl;
    return this;
  }

   /**
   * Get photoUrl
   * @return photoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhotoUrl() {
    return photoUrl;
  }


  public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }


  public ApplicationUser referralCode(String referralCode) {
    
    this.referralCode = referralCode;
    return this;
  }

   /**
   * Get referralCode
   * @return referralCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReferralCode() {
    return referralCode;
  }


  public void setReferralCode(String referralCode) {
    this.referralCode = referralCode;
  }


  public ApplicationUser recoveryToken(String recoveryToken) {
    
    this.recoveryToken = recoveryToken;
    return this;
  }

   /**
   * Get recoveryToken
   * @return recoveryToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRecoveryToken() {
    return recoveryToken;
  }


  public void setRecoveryToken(String recoveryToken) {
    this.recoveryToken = recoveryToken;
  }


  public ApplicationUser digiLockerLastSyncDate(OffsetDateTime digiLockerLastSyncDate) {
    
    this.digiLockerLastSyncDate = digiLockerLastSyncDate;
    return this;
  }

   /**
   * Get digiLockerLastSyncDate
   * @return digiLockerLastSyncDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDigiLockerLastSyncDate() {
    return digiLockerLastSyncDate;
  }


  public void setDigiLockerLastSyncDate(OffsetDateTime digiLockerLastSyncDate) {
    this.digiLockerLastSyncDate = digiLockerLastSyncDate;
  }


  public ApplicationUser refreshTokens(List<RefreshToken> refreshTokens) {
    
    this.refreshTokens = refreshTokens;
    return this;
  }

  public ApplicationUser addRefreshTokensItem(RefreshToken refreshTokensItem) {
    if (this.refreshTokens == null) {
      this.refreshTokens = new ArrayList<RefreshToken>();
    }
    this.refreshTokens.add(refreshTokensItem);
    return this;
  }

   /**
   * Get refreshTokens
   * @return refreshTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RefreshToken> getRefreshTokens() {
    return refreshTokens;
  }


  public void setRefreshTokens(List<RefreshToken> refreshTokens) {
    this.refreshTokens = refreshTokens;
  }


  public ApplicationUser country(Country country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Country getCountry() {
    return country;
  }


  public void setCountry(Country country) {
    this.country = country;
  }


  public ApplicationUser referredByUser(ApplicationUser referredByUser) {
    
    this.referredByUser = referredByUser;
    return this;
  }

   /**
   * Get referredByUser
   * @return referredByUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplicationUser getReferredByUser() {
    return referredByUser;
  }


  public void setReferredByUser(ApplicationUser referredByUser) {
    this.referredByUser = referredByUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationUser applicationUser = (ApplicationUser) o;
    return Objects.equals(this.id, applicationUser.id) &&
        Objects.equals(this.userName, applicationUser.userName) &&
        Objects.equals(this.normalizedUserName, applicationUser.normalizedUserName) &&
        Objects.equals(this.email, applicationUser.email) &&
        Objects.equals(this.normalizedEmail, applicationUser.normalizedEmail) &&
        Objects.equals(this.emailConfirmed, applicationUser.emailConfirmed) &&
        Objects.equals(this.passwordHash, applicationUser.passwordHash) &&
        Objects.equals(this.securityStamp, applicationUser.securityStamp) &&
        Objects.equals(this.concurrencyStamp, applicationUser.concurrencyStamp) &&
        Objects.equals(this.phoneNumber, applicationUser.phoneNumber) &&
        Objects.equals(this.phoneNumberConfirmed, applicationUser.phoneNumberConfirmed) &&
        Objects.equals(this.twoFactorEnabled, applicationUser.twoFactorEnabled) &&
        Objects.equals(this.lockoutEnd, applicationUser.lockoutEnd) &&
        Objects.equals(this.lockoutEnabled, applicationUser.lockoutEnabled) &&
        Objects.equals(this.accessFailedCount, applicationUser.accessFailedCount) &&
        Objects.equals(this.firstName, applicationUser.firstName) &&
        Objects.equals(this.middleName, applicationUser.middleName) &&
        Objects.equals(this.lastName, applicationUser.lastName) &&
        Objects.equals(this.fullName, applicationUser.fullName) &&
        Objects.equals(this.gender, applicationUser.gender) &&
        Objects.equals(this.dateOfBirth, applicationUser.dateOfBirth) &&
        Objects.equals(this.countryId, applicationUser.countryId) &&
        Objects.equals(this.postCode, applicationUser.postCode) &&
        Objects.equals(this.referredBy, applicationUser.referredBy) &&
        Objects.equals(this.language, applicationUser.language) &&
        Objects.equals(this.theme, applicationUser.theme) &&
        Objects.equals(this.designation, applicationUser.designation) &&
        Objects.equals(this.isMarkedForDeletion, applicationUser.isMarkedForDeletion) &&
        Objects.equals(this.hardDeleteDate, applicationUser.hardDeleteDate) &&
        Objects.equals(this.securityPin, applicationUser.securityPin) &&
        Objects.equals(this.photoUrl, applicationUser.photoUrl) &&
        Objects.equals(this.referralCode, applicationUser.referralCode) &&
        Objects.equals(this.recoveryToken, applicationUser.recoveryToken) &&
        Objects.equals(this.digiLockerLastSyncDate, applicationUser.digiLockerLastSyncDate) &&
        Objects.equals(this.refreshTokens, applicationUser.refreshTokens) &&
        Objects.equals(this.country, applicationUser.country) &&
        Objects.equals(this.referredByUser, applicationUser.referredByUser);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userName, normalizedUserName, email, normalizedEmail, emailConfirmed, passwordHash, securityStamp, concurrencyStamp, phoneNumber, phoneNumberConfirmed, twoFactorEnabled, lockoutEnd, lockoutEnabled, accessFailedCount, firstName, middleName, lastName, fullName, gender, dateOfBirth, countryId, postCode, referredBy, language, theme, designation, isMarkedForDeletion, hardDeleteDate, securityPin, photoUrl, referralCode, recoveryToken, digiLockerLastSyncDate, refreshTokens, country, referredByUser);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent()
      ? (a.get().getClass().isArray() ? Arrays.hashCode((T[])a.get()) : Objects.hashCode(a.get()))
      : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    normalizedUserName: ").append(toIndentedString(normalizedUserName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    normalizedEmail: ").append(toIndentedString(normalizedEmail)).append("\n");
    sb.append("    emailConfirmed: ").append(toIndentedString(emailConfirmed)).append("\n");
    sb.append("    passwordHash: ").append(toIndentedString(passwordHash)).append("\n");
    sb.append("    securityStamp: ").append(toIndentedString(securityStamp)).append("\n");
    sb.append("    concurrencyStamp: ").append(toIndentedString(concurrencyStamp)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumberConfirmed: ").append(toIndentedString(phoneNumberConfirmed)).append("\n");
    sb.append("    twoFactorEnabled: ").append(toIndentedString(twoFactorEnabled)).append("\n");
    sb.append("    lockoutEnd: ").append(toIndentedString(lockoutEnd)).append("\n");
    sb.append("    lockoutEnabled: ").append(toIndentedString(lockoutEnabled)).append("\n");
    sb.append("    accessFailedCount: ").append(toIndentedString(accessFailedCount)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    referredBy: ").append(toIndentedString(referredBy)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
    sb.append("    isMarkedForDeletion: ").append(toIndentedString(isMarkedForDeletion)).append("\n");
    sb.append("    hardDeleteDate: ").append(toIndentedString(hardDeleteDate)).append("\n");
    sb.append("    securityPin: ").append(toIndentedString(securityPin)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    referralCode: ").append(toIndentedString(referralCode)).append("\n");
    sb.append("    recoveryToken: ").append(toIndentedString(recoveryToken)).append("\n");
    sb.append("    digiLockerLastSyncDate: ").append(toIndentedString(digiLockerLastSyncDate)).append("\n");
    sb.append("    refreshTokens: ").append(toIndentedString(refreshTokens)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    referredByUser: ").append(toIndentedString(referredByUser)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

