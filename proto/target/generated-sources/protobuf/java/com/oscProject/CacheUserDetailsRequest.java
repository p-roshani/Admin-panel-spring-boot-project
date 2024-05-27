// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cache.proto

package com.oscProject;

/**
 * Protobuf type {@code CacheUserDetailsRequest}
 */
public final class CacheUserDetailsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CacheUserDetailsRequest)
    CacheUserDetailsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CacheUserDetailsRequest.newBuilder() to construct.
  private CacheUserDetailsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CacheUserDetailsRequest() {
    otp_ = "";
    userId_ = "";
    userName_ = "";
    emailId_ = "";
    dob_ = "";
    mobileNo_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CacheUserDetailsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CacheUserDetailsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            otp_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            userId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            userName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            emailId_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            dob_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            mobileNo_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.oscProject.Cache.internal_static_CacheUserDetailsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.oscProject.Cache.internal_static_CacheUserDetailsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.oscProject.CacheUserDetailsRequest.class, com.oscProject.CacheUserDetailsRequest.Builder.class);
  }

  public static final int OTP_FIELD_NUMBER = 1;
  private volatile java.lang.Object otp_;
  /**
   * <code>string otp = 1;</code>
   * @return The otp.
   */
  @java.lang.Override
  public java.lang.String getOtp() {
    java.lang.Object ref = otp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      otp_ = s;
      return s;
    }
  }
  /**
   * <code>string otp = 1;</code>
   * @return The bytes for otp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOtpBytes() {
    java.lang.Object ref = otp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      otp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERID_FIELD_NUMBER = 2;
  private volatile java.lang.Object userId_;
  /**
   * <code>string userId = 2;</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string userId = 2;</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object userName_;
  /**
   * <code>string userName = 3;</code>
   * @return The userName.
   */
  @java.lang.Override
  public java.lang.String getUserName() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userName_ = s;
      return s;
    }
  }
  /**
   * <code>string userName = 3;</code>
   * @return The bytes for userName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserNameBytes() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAILID_FIELD_NUMBER = 4;
  private volatile java.lang.Object emailId_;
  /**
   * <code>string emailId = 4;</code>
   * @return The emailId.
   */
  @java.lang.Override
  public java.lang.String getEmailId() {
    java.lang.Object ref = emailId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      emailId_ = s;
      return s;
    }
  }
  /**
   * <code>string emailId = 4;</code>
   * @return The bytes for emailId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailIdBytes() {
    java.lang.Object ref = emailId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      emailId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOB_FIELD_NUMBER = 5;
  private volatile java.lang.Object dob_;
  /**
   * <code>string dob = 5;</code>
   * @return The dob.
   */
  @java.lang.Override
  public java.lang.String getDob() {
    java.lang.Object ref = dob_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dob_ = s;
      return s;
    }
  }
  /**
   * <code>string dob = 5;</code>
   * @return The bytes for dob.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDobBytes() {
    java.lang.Object ref = dob_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dob_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MOBILENO_FIELD_NUMBER = 6;
  private volatile java.lang.Object mobileNo_;
  /**
   * <code>string mobileNo = 6;</code>
   * @return The mobileNo.
   */
  @java.lang.Override
  public java.lang.String getMobileNo() {
    java.lang.Object ref = mobileNo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mobileNo_ = s;
      return s;
    }
  }
  /**
   * <code>string mobileNo = 6;</code>
   * @return The bytes for mobileNo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMobileNoBytes() {
    java.lang.Object ref = mobileNo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mobileNo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(otp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, otp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(emailId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, emailId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dob_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, dob_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mobileNo_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, mobileNo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(otp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, otp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(emailId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, emailId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dob_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, dob_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mobileNo_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, mobileNo_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.oscProject.CacheUserDetailsRequest)) {
      return super.equals(obj);
    }
    com.oscProject.CacheUserDetailsRequest other = (com.oscProject.CacheUserDetailsRequest) obj;

    if (!getOtp()
        .equals(other.getOtp())) return false;
    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getUserName()
        .equals(other.getUserName())) return false;
    if (!getEmailId()
        .equals(other.getEmailId())) return false;
    if (!getDob()
        .equals(other.getDob())) return false;
    if (!getMobileNo()
        .equals(other.getMobileNo())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OTP_FIELD_NUMBER;
    hash = (53 * hash) + getOtp().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUserName().hashCode();
    hash = (37 * hash) + EMAILID_FIELD_NUMBER;
    hash = (53 * hash) + getEmailId().hashCode();
    hash = (37 * hash) + DOB_FIELD_NUMBER;
    hash = (53 * hash) + getDob().hashCode();
    hash = (37 * hash) + MOBILENO_FIELD_NUMBER;
    hash = (53 * hash) + getMobileNo().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.oscProject.CacheUserDetailsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oscProject.CacheUserDetailsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oscProject.CacheUserDetailsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oscProject.CacheUserDetailsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oscProject.CacheUserDetailsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oscProject.CacheUserDetailsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oscProject.CacheUserDetailsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.oscProject.CacheUserDetailsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.oscProject.CacheUserDetailsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.oscProject.CacheUserDetailsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.oscProject.CacheUserDetailsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.oscProject.CacheUserDetailsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.oscProject.CacheUserDetailsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code CacheUserDetailsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CacheUserDetailsRequest)
      com.oscProject.CacheUserDetailsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.oscProject.Cache.internal_static_CacheUserDetailsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.oscProject.Cache.internal_static_CacheUserDetailsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.oscProject.CacheUserDetailsRequest.class, com.oscProject.CacheUserDetailsRequest.Builder.class);
    }

    // Construct using com.oscProject.CacheUserDetailsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      otp_ = "";

      userId_ = "";

      userName_ = "";

      emailId_ = "";

      dob_ = "";

      mobileNo_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.oscProject.Cache.internal_static_CacheUserDetailsRequest_descriptor;
    }

    @java.lang.Override
    public com.oscProject.CacheUserDetailsRequest getDefaultInstanceForType() {
      return com.oscProject.CacheUserDetailsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.oscProject.CacheUserDetailsRequest build() {
      com.oscProject.CacheUserDetailsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.oscProject.CacheUserDetailsRequest buildPartial() {
      com.oscProject.CacheUserDetailsRequest result = new com.oscProject.CacheUserDetailsRequest(this);
      result.otp_ = otp_;
      result.userId_ = userId_;
      result.userName_ = userName_;
      result.emailId_ = emailId_;
      result.dob_ = dob_;
      result.mobileNo_ = mobileNo_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.oscProject.CacheUserDetailsRequest) {
        return mergeFrom((com.oscProject.CacheUserDetailsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.oscProject.CacheUserDetailsRequest other) {
      if (other == com.oscProject.CacheUserDetailsRequest.getDefaultInstance()) return this;
      if (!other.getOtp().isEmpty()) {
        otp_ = other.otp_;
        onChanged();
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (!other.getUserName().isEmpty()) {
        userName_ = other.userName_;
        onChanged();
      }
      if (!other.getEmailId().isEmpty()) {
        emailId_ = other.emailId_;
        onChanged();
      }
      if (!other.getDob().isEmpty()) {
        dob_ = other.dob_;
        onChanged();
      }
      if (!other.getMobileNo().isEmpty()) {
        mobileNo_ = other.mobileNo_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.oscProject.CacheUserDetailsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.oscProject.CacheUserDetailsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object otp_ = "";
    /**
     * <code>string otp = 1;</code>
     * @return The otp.
     */
    public java.lang.String getOtp() {
      java.lang.Object ref = otp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        otp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string otp = 1;</code>
     * @return The bytes for otp.
     */
    public com.google.protobuf.ByteString
        getOtpBytes() {
      java.lang.Object ref = otp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        otp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string otp = 1;</code>
     * @param value The otp to set.
     * @return This builder for chaining.
     */
    public Builder setOtp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      otp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string otp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOtp() {
      
      otp_ = getDefaultInstance().getOtp();
      onChanged();
      return this;
    }
    /**
     * <code>string otp = 1;</code>
     * @param value The bytes for otp to set.
     * @return This builder for chaining.
     */
    public Builder setOtpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      otp_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string userId = 2;</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userId = 2;</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userId = 2;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string userId = 2;</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userName_ = "";
    /**
     * <code>string userName = 3;</code>
     * @return The userName.
     */
    public java.lang.String getUserName() {
      java.lang.Object ref = userName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userName = 3;</code>
     * @return The bytes for userName.
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      java.lang.Object ref = userName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userName = 3;</code>
     * @param value The userName to set.
     * @return This builder for chaining.
     */
    public Builder setUserName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userName = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserName() {
      
      userName_ = getDefaultInstance().getUserName();
      onChanged();
      return this;
    }
    /**
     * <code>string userName = 3;</code>
     * @param value The bytes for userName to set.
     * @return This builder for chaining.
     */
    public Builder setUserNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object emailId_ = "";
    /**
     * <code>string emailId = 4;</code>
     * @return The emailId.
     */
    public java.lang.String getEmailId() {
      java.lang.Object ref = emailId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        emailId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string emailId = 4;</code>
     * @return The bytes for emailId.
     */
    public com.google.protobuf.ByteString
        getEmailIdBytes() {
      java.lang.Object ref = emailId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        emailId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string emailId = 4;</code>
     * @param value The emailId to set.
     * @return This builder for chaining.
     */
    public Builder setEmailId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      emailId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string emailId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmailId() {
      
      emailId_ = getDefaultInstance().getEmailId();
      onChanged();
      return this;
    }
    /**
     * <code>string emailId = 4;</code>
     * @param value The bytes for emailId to set.
     * @return This builder for chaining.
     */
    public Builder setEmailIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      emailId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dob_ = "";
    /**
     * <code>string dob = 5;</code>
     * @return The dob.
     */
    public java.lang.String getDob() {
      java.lang.Object ref = dob_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dob_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dob = 5;</code>
     * @return The bytes for dob.
     */
    public com.google.protobuf.ByteString
        getDobBytes() {
      java.lang.Object ref = dob_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dob_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dob = 5;</code>
     * @param value The dob to set.
     * @return This builder for chaining.
     */
    public Builder setDob(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dob_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dob = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDob() {
      
      dob_ = getDefaultInstance().getDob();
      onChanged();
      return this;
    }
    /**
     * <code>string dob = 5;</code>
     * @param value The bytes for dob to set.
     * @return This builder for chaining.
     */
    public Builder setDobBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dob_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object mobileNo_ = "";
    /**
     * <code>string mobileNo = 6;</code>
     * @return The mobileNo.
     */
    public java.lang.String getMobileNo() {
      java.lang.Object ref = mobileNo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mobileNo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mobileNo = 6;</code>
     * @return The bytes for mobileNo.
     */
    public com.google.protobuf.ByteString
        getMobileNoBytes() {
      java.lang.Object ref = mobileNo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mobileNo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mobileNo = 6;</code>
     * @param value The mobileNo to set.
     * @return This builder for chaining.
     */
    public Builder setMobileNo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mobileNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mobileNo = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMobileNo() {
      
      mobileNo_ = getDefaultInstance().getMobileNo();
      onChanged();
      return this;
    }
    /**
     * <code>string mobileNo = 6;</code>
     * @param value The bytes for mobileNo to set.
     * @return This builder for chaining.
     */
    public Builder setMobileNoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mobileNo_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:CacheUserDetailsRequest)
  }

  // @@protoc_insertion_point(class_scope:CacheUserDetailsRequest)
  private static final com.oscProject.CacheUserDetailsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.oscProject.CacheUserDetailsRequest();
  }

  public static com.oscProject.CacheUserDetailsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CacheUserDetailsRequest>
      PARSER = new com.google.protobuf.AbstractParser<CacheUserDetailsRequest>() {
    @java.lang.Override
    public CacheUserDetailsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CacheUserDetailsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CacheUserDetailsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CacheUserDetailsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.oscProject.CacheUserDetailsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

