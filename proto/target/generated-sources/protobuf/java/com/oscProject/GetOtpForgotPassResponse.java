// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cache.proto

package com.oscProject;

/**
 * Protobuf type {@code GetOtpForgotPassResponse}
 */
public final class GetOtpForgotPassResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetOtpForgotPassResponse)
    GetOtpForgotPassResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetOtpForgotPassResponse.newBuilder() to construct.
  private GetOtpForgotPassResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetOtpForgotPassResponse() {
    emailId_ = "";
    otp_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetOtpForgotPassResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetOtpForgotPassResponse(
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

            emailId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            otp_ = s;
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
    return com.oscProject.Cache.internal_static_GetOtpForgotPassResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.oscProject.Cache.internal_static_GetOtpForgotPassResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.oscProject.GetOtpForgotPassResponse.class, com.oscProject.GetOtpForgotPassResponse.Builder.class);
  }

  public static final int EMAILID_FIELD_NUMBER = 1;
  private volatile java.lang.Object emailId_;
  /**
   * <code>string emailId = 1;</code>
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
   * <code>string emailId = 1;</code>
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

  public static final int OTP_FIELD_NUMBER = 2;
  private volatile java.lang.Object otp_;
  /**
   * <code>string otp = 2;</code>
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
   * <code>string otp = 2;</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(emailId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, emailId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(otp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, otp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(emailId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, emailId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(otp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, otp_);
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
    if (!(obj instanceof com.oscProject.GetOtpForgotPassResponse)) {
      return super.equals(obj);
    }
    com.oscProject.GetOtpForgotPassResponse other = (com.oscProject.GetOtpForgotPassResponse) obj;

    if (!getEmailId()
        .equals(other.getEmailId())) return false;
    if (!getOtp()
        .equals(other.getOtp())) return false;
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
    hash = (37 * hash) + EMAILID_FIELD_NUMBER;
    hash = (53 * hash) + getEmailId().hashCode();
    hash = (37 * hash) + OTP_FIELD_NUMBER;
    hash = (53 * hash) + getOtp().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.oscProject.GetOtpForgotPassResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oscProject.GetOtpForgotPassResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oscProject.GetOtpForgotPassResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oscProject.GetOtpForgotPassResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oscProject.GetOtpForgotPassResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.oscProject.GetOtpForgotPassResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.oscProject.GetOtpForgotPassResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.oscProject.GetOtpForgotPassResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.oscProject.GetOtpForgotPassResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.oscProject.GetOtpForgotPassResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.oscProject.GetOtpForgotPassResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.oscProject.GetOtpForgotPassResponse parseFrom(
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
  public static Builder newBuilder(com.oscProject.GetOtpForgotPassResponse prototype) {
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
   * Protobuf type {@code GetOtpForgotPassResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetOtpForgotPassResponse)
      com.oscProject.GetOtpForgotPassResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.oscProject.Cache.internal_static_GetOtpForgotPassResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.oscProject.Cache.internal_static_GetOtpForgotPassResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.oscProject.GetOtpForgotPassResponse.class, com.oscProject.GetOtpForgotPassResponse.Builder.class);
    }

    // Construct using com.oscProject.GetOtpForgotPassResponse.newBuilder()
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
      emailId_ = "";

      otp_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.oscProject.Cache.internal_static_GetOtpForgotPassResponse_descriptor;
    }

    @java.lang.Override
    public com.oscProject.GetOtpForgotPassResponse getDefaultInstanceForType() {
      return com.oscProject.GetOtpForgotPassResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.oscProject.GetOtpForgotPassResponse build() {
      com.oscProject.GetOtpForgotPassResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.oscProject.GetOtpForgotPassResponse buildPartial() {
      com.oscProject.GetOtpForgotPassResponse result = new com.oscProject.GetOtpForgotPassResponse(this);
      result.emailId_ = emailId_;
      result.otp_ = otp_;
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
      if (other instanceof com.oscProject.GetOtpForgotPassResponse) {
        return mergeFrom((com.oscProject.GetOtpForgotPassResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.oscProject.GetOtpForgotPassResponse other) {
      if (other == com.oscProject.GetOtpForgotPassResponse.getDefaultInstance()) return this;
      if (!other.getEmailId().isEmpty()) {
        emailId_ = other.emailId_;
        onChanged();
      }
      if (!other.getOtp().isEmpty()) {
        otp_ = other.otp_;
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
      com.oscProject.GetOtpForgotPassResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.oscProject.GetOtpForgotPassResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object emailId_ = "";
    /**
     * <code>string emailId = 1;</code>
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
     * <code>string emailId = 1;</code>
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
     * <code>string emailId = 1;</code>
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
     * <code>string emailId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmailId() {
      
      emailId_ = getDefaultInstance().getEmailId();
      onChanged();
      return this;
    }
    /**
     * <code>string emailId = 1;</code>
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

    private java.lang.Object otp_ = "";
    /**
     * <code>string otp = 2;</code>
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
     * <code>string otp = 2;</code>
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
     * <code>string otp = 2;</code>
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
     * <code>string otp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOtp() {
      
      otp_ = getDefaultInstance().getOtp();
      onChanged();
      return this;
    }
    /**
     * <code>string otp = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:GetOtpForgotPassResponse)
  }

  // @@protoc_insertion_point(class_scope:GetOtpForgotPassResponse)
  private static final com.oscProject.GetOtpForgotPassResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.oscProject.GetOtpForgotPassResponse();
  }

  public static com.oscProject.GetOtpForgotPassResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetOtpForgotPassResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetOtpForgotPassResponse>() {
    @java.lang.Override
    public GetOtpForgotPassResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetOtpForgotPassResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetOtpForgotPassResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetOtpForgotPassResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.oscProject.GetOtpForgotPassResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

