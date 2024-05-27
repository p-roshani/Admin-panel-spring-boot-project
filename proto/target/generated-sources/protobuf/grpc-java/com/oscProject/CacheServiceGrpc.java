package com.oscProject;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: cache.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CacheServiceGrpc {

  private CacheServiceGrpc() {}

  public static final String SERVICE_NAME = "CacheService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.oscProject.CacheUserDetailsRequest,
      com.oscProject.CacheUserDetailsResponse> getStoreOtpUserIdInCacheMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "storeOtpUserIdInCache",
      requestType = com.oscProject.CacheUserDetailsRequest.class,
      responseType = com.oscProject.CacheUserDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oscProject.CacheUserDetailsRequest,
      com.oscProject.CacheUserDetailsResponse> getStoreOtpUserIdInCacheMethod() {
    io.grpc.MethodDescriptor<com.oscProject.CacheUserDetailsRequest, com.oscProject.CacheUserDetailsResponse> getStoreOtpUserIdInCacheMethod;
    if ((getStoreOtpUserIdInCacheMethod = CacheServiceGrpc.getStoreOtpUserIdInCacheMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getStoreOtpUserIdInCacheMethod = CacheServiceGrpc.getStoreOtpUserIdInCacheMethod) == null) {
          CacheServiceGrpc.getStoreOtpUserIdInCacheMethod = getStoreOtpUserIdInCacheMethod =
              io.grpc.MethodDescriptor.<com.oscProject.CacheUserDetailsRequest, com.oscProject.CacheUserDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "storeOtpUserIdInCache"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oscProject.CacheUserDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oscProject.CacheUserDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("storeOtpUserIdInCache"))
              .build();
        }
      }
    }
    return getStoreOtpUserIdInCacheMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oscProject.GetOtpRequest,
      com.oscProject.GetOtpResponse> getGetOtpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOtp",
      requestType = com.oscProject.GetOtpRequest.class,
      responseType = com.oscProject.GetOtpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oscProject.GetOtpRequest,
      com.oscProject.GetOtpResponse> getGetOtpMethod() {
    io.grpc.MethodDescriptor<com.oscProject.GetOtpRequest, com.oscProject.GetOtpResponse> getGetOtpMethod;
    if ((getGetOtpMethod = CacheServiceGrpc.getGetOtpMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getGetOtpMethod = CacheServiceGrpc.getGetOtpMethod) == null) {
          CacheServiceGrpc.getGetOtpMethod = getGetOtpMethod =
              io.grpc.MethodDescriptor.<com.oscProject.GetOtpRequest, com.oscProject.GetOtpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getOtp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oscProject.GetOtpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oscProject.GetOtpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("getOtp"))
              .build();
        }
      }
    }
    return getGetOtpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oscProject.GetUserDetailsRequest,
      com.oscProject.GetUserDetailsResponse> getGetUserDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserDetails",
      requestType = com.oscProject.GetUserDetailsRequest.class,
      responseType = com.oscProject.GetUserDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oscProject.GetUserDetailsRequest,
      com.oscProject.GetUserDetailsResponse> getGetUserDetailsMethod() {
    io.grpc.MethodDescriptor<com.oscProject.GetUserDetailsRequest, com.oscProject.GetUserDetailsResponse> getGetUserDetailsMethod;
    if ((getGetUserDetailsMethod = CacheServiceGrpc.getGetUserDetailsMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getGetUserDetailsMethod = CacheServiceGrpc.getGetUserDetailsMethod) == null) {
          CacheServiceGrpc.getGetUserDetailsMethod = getGetUserDetailsMethod =
              io.grpc.MethodDescriptor.<com.oscProject.GetUserDetailsRequest, com.oscProject.GetUserDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUserDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oscProject.GetUserDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oscProject.GetUserDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("getUserDetails"))
              .build();
        }
      }
    }
    return getGetUserDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oscProject.GetUserIdRequest,
      com.oscProject.GetCacheClearResponse> getClearCacheMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clearCache",
      requestType = com.oscProject.GetUserIdRequest.class,
      responseType = com.oscProject.GetCacheClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oscProject.GetUserIdRequest,
      com.oscProject.GetCacheClearResponse> getClearCacheMethod() {
    io.grpc.MethodDescriptor<com.oscProject.GetUserIdRequest, com.oscProject.GetCacheClearResponse> getClearCacheMethod;
    if ((getClearCacheMethod = CacheServiceGrpc.getClearCacheMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getClearCacheMethod = CacheServiceGrpc.getClearCacheMethod) == null) {
          CacheServiceGrpc.getClearCacheMethod = getClearCacheMethod =
              io.grpc.MethodDescriptor.<com.oscProject.GetUserIdRequest, com.oscProject.GetCacheClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clearCache"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oscProject.GetUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oscProject.GetCacheClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("clearCache"))
              .build();
        }
      }
    }
    return getClearCacheMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oscProject.CacheOtpForgotPassRequest,
      com.oscProject.CacheUserDetailsResponse> getStoreOtpInCacheForgotPassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "storeOtpInCacheForgotPass",
      requestType = com.oscProject.CacheOtpForgotPassRequest.class,
      responseType = com.oscProject.CacheUserDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oscProject.CacheOtpForgotPassRequest,
      com.oscProject.CacheUserDetailsResponse> getStoreOtpInCacheForgotPassMethod() {
    io.grpc.MethodDescriptor<com.oscProject.CacheOtpForgotPassRequest, com.oscProject.CacheUserDetailsResponse> getStoreOtpInCacheForgotPassMethod;
    if ((getStoreOtpInCacheForgotPassMethod = CacheServiceGrpc.getStoreOtpInCacheForgotPassMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getStoreOtpInCacheForgotPassMethod = CacheServiceGrpc.getStoreOtpInCacheForgotPassMethod) == null) {
          CacheServiceGrpc.getStoreOtpInCacheForgotPassMethod = getStoreOtpInCacheForgotPassMethod =
              io.grpc.MethodDescriptor.<com.oscProject.CacheOtpForgotPassRequest, com.oscProject.CacheUserDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "storeOtpInCacheForgotPass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oscProject.CacheOtpForgotPassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oscProject.CacheUserDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("storeOtpInCacheForgotPass"))
              .build();
        }
      }
    }
    return getStoreOtpInCacheForgotPassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oscProject.GetOtpForgotPassRequest,
      com.oscProject.GetOtpForgotPassResponse> getGetOtpForgotPassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOtpForgotPass",
      requestType = com.oscProject.GetOtpForgotPassRequest.class,
      responseType = com.oscProject.GetOtpForgotPassResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oscProject.GetOtpForgotPassRequest,
      com.oscProject.GetOtpForgotPassResponse> getGetOtpForgotPassMethod() {
    io.grpc.MethodDescriptor<com.oscProject.GetOtpForgotPassRequest, com.oscProject.GetOtpForgotPassResponse> getGetOtpForgotPassMethod;
    if ((getGetOtpForgotPassMethod = CacheServiceGrpc.getGetOtpForgotPassMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getGetOtpForgotPassMethod = CacheServiceGrpc.getGetOtpForgotPassMethod) == null) {
          CacheServiceGrpc.getGetOtpForgotPassMethod = getGetOtpForgotPassMethod =
              io.grpc.MethodDescriptor.<com.oscProject.GetOtpForgotPassRequest, com.oscProject.GetOtpForgotPassResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getOtpForgotPass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oscProject.GetOtpForgotPassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oscProject.GetOtpForgotPassResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("getOtpForgotPass"))
              .build();
        }
      }
    }
    return getGetOtpForgotPassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oscProject.GetUserDetToChangePasswordRequest,
      com.oscProject.GetUserDetailsResponse> getGetUserDetailsToChangePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserDetailsToChangePassword",
      requestType = com.oscProject.GetUserDetToChangePasswordRequest.class,
      responseType = com.oscProject.GetUserDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oscProject.GetUserDetToChangePasswordRequest,
      com.oscProject.GetUserDetailsResponse> getGetUserDetailsToChangePasswordMethod() {
    io.grpc.MethodDescriptor<com.oscProject.GetUserDetToChangePasswordRequest, com.oscProject.GetUserDetailsResponse> getGetUserDetailsToChangePasswordMethod;
    if ((getGetUserDetailsToChangePasswordMethod = CacheServiceGrpc.getGetUserDetailsToChangePasswordMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getGetUserDetailsToChangePasswordMethod = CacheServiceGrpc.getGetUserDetailsToChangePasswordMethod) == null) {
          CacheServiceGrpc.getGetUserDetailsToChangePasswordMethod = getGetUserDetailsToChangePasswordMethod =
              io.grpc.MethodDescriptor.<com.oscProject.GetUserDetToChangePasswordRequest, com.oscProject.GetUserDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUserDetailsToChangePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oscProject.GetUserDetToChangePasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oscProject.GetUserDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("getUserDetailsToChangePassword"))
              .build();
        }
      }
    }
    return getGetUserDetailsToChangePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.oscProject.GetPasswordRequest,
      com.oscProject.GetCacheClearResponse> getClearCacheForForgotPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clearCacheForForgotPassword",
      requestType = com.oscProject.GetPasswordRequest.class,
      responseType = com.oscProject.GetCacheClearResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.oscProject.GetPasswordRequest,
      com.oscProject.GetCacheClearResponse> getClearCacheForForgotPasswordMethod() {
    io.grpc.MethodDescriptor<com.oscProject.GetPasswordRequest, com.oscProject.GetCacheClearResponse> getClearCacheForForgotPasswordMethod;
    if ((getClearCacheForForgotPasswordMethod = CacheServiceGrpc.getClearCacheForForgotPasswordMethod) == null) {
      synchronized (CacheServiceGrpc.class) {
        if ((getClearCacheForForgotPasswordMethod = CacheServiceGrpc.getClearCacheForForgotPasswordMethod) == null) {
          CacheServiceGrpc.getClearCacheForForgotPasswordMethod = getClearCacheForForgotPasswordMethod =
              io.grpc.MethodDescriptor.<com.oscProject.GetPasswordRequest, com.oscProject.GetCacheClearResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clearCacheForForgotPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oscProject.GetPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.oscProject.GetCacheClearResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CacheServiceMethodDescriptorSupplier("clearCacheForForgotPassword"))
              .build();
        }
      }
    }
    return getClearCacheForForgotPasswordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CacheServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CacheServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CacheServiceStub>() {
        @java.lang.Override
        public CacheServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CacheServiceStub(channel, callOptions);
        }
      };
    return CacheServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CacheServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CacheServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CacheServiceBlockingStub>() {
        @java.lang.Override
        public CacheServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CacheServiceBlockingStub(channel, callOptions);
        }
      };
    return CacheServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CacheServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CacheServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CacheServiceFutureStub>() {
        @java.lang.Override
        public CacheServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CacheServiceFutureStub(channel, callOptions);
        }
      };
    return CacheServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CacheServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void storeOtpUserIdInCache(com.oscProject.CacheUserDetailsRequest request,
        io.grpc.stub.StreamObserver<com.oscProject.CacheUserDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreOtpUserIdInCacheMethod(), responseObserver);
    }

    /**
     */
    public void getOtp(com.oscProject.GetOtpRequest request,
        io.grpc.stub.StreamObserver<com.oscProject.GetOtpResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOtpMethod(), responseObserver);
    }

    /**
     */
    public void getUserDetails(com.oscProject.GetUserDetailsRequest request,
        io.grpc.stub.StreamObserver<com.oscProject.GetUserDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserDetailsMethod(), responseObserver);
    }

    /**
     */
    public void clearCache(com.oscProject.GetUserIdRequest request,
        io.grpc.stub.StreamObserver<com.oscProject.GetCacheClearResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearCacheMethod(), responseObserver);
    }

    /**
     */
    public void storeOtpInCacheForgotPass(com.oscProject.CacheOtpForgotPassRequest request,
        io.grpc.stub.StreamObserver<com.oscProject.CacheUserDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStoreOtpInCacheForgotPassMethod(), responseObserver);
    }

    /**
     */
    public void getOtpForgotPass(com.oscProject.GetOtpForgotPassRequest request,
        io.grpc.stub.StreamObserver<com.oscProject.GetOtpForgotPassResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOtpForgotPassMethod(), responseObserver);
    }

    /**
     */
    public void getUserDetailsToChangePassword(com.oscProject.GetUserDetToChangePasswordRequest request,
        io.grpc.stub.StreamObserver<com.oscProject.GetUserDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserDetailsToChangePasswordMethod(), responseObserver);
    }

    /**
     */
    public void clearCacheForForgotPassword(com.oscProject.GetPasswordRequest request,
        io.grpc.stub.StreamObserver<com.oscProject.GetCacheClearResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearCacheForForgotPasswordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStoreOtpUserIdInCacheMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.oscProject.CacheUserDetailsRequest,
                com.oscProject.CacheUserDetailsResponse>(
                  this, METHODID_STORE_OTP_USER_ID_IN_CACHE)))
          .addMethod(
            getGetOtpMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.oscProject.GetOtpRequest,
                com.oscProject.GetOtpResponse>(
                  this, METHODID_GET_OTP)))
          .addMethod(
            getGetUserDetailsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.oscProject.GetUserDetailsRequest,
                com.oscProject.GetUserDetailsResponse>(
                  this, METHODID_GET_USER_DETAILS)))
          .addMethod(
            getClearCacheMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.oscProject.GetUserIdRequest,
                com.oscProject.GetCacheClearResponse>(
                  this, METHODID_CLEAR_CACHE)))
          .addMethod(
            getStoreOtpInCacheForgotPassMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.oscProject.CacheOtpForgotPassRequest,
                com.oscProject.CacheUserDetailsResponse>(
                  this, METHODID_STORE_OTP_IN_CACHE_FORGOT_PASS)))
          .addMethod(
            getGetOtpForgotPassMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.oscProject.GetOtpForgotPassRequest,
                com.oscProject.GetOtpForgotPassResponse>(
                  this, METHODID_GET_OTP_FORGOT_PASS)))
          .addMethod(
            getGetUserDetailsToChangePasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.oscProject.GetUserDetToChangePasswordRequest,
                com.oscProject.GetUserDetailsResponse>(
                  this, METHODID_GET_USER_DETAILS_TO_CHANGE_PASSWORD)))
          .addMethod(
            getClearCacheForForgotPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.oscProject.GetPasswordRequest,
                com.oscProject.GetCacheClearResponse>(
                  this, METHODID_CLEAR_CACHE_FOR_FORGOT_PASSWORD)))
          .build();
    }
  }

  /**
   */
  public static final class CacheServiceStub extends io.grpc.stub.AbstractAsyncStub<CacheServiceStub> {
    private CacheServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CacheServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CacheServiceStub(channel, callOptions);
    }

    /**
     */
    public void storeOtpUserIdInCache(com.oscProject.CacheUserDetailsRequest request,
        io.grpc.stub.StreamObserver<com.oscProject.CacheUserDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreOtpUserIdInCacheMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOtp(com.oscProject.GetOtpRequest request,
        io.grpc.stub.StreamObserver<com.oscProject.GetOtpResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOtpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserDetails(com.oscProject.GetUserDetailsRequest request,
        io.grpc.stub.StreamObserver<com.oscProject.GetUserDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clearCache(com.oscProject.GetUserIdRequest request,
        io.grpc.stub.StreamObserver<com.oscProject.GetCacheClearResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearCacheMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void storeOtpInCacheForgotPass(com.oscProject.CacheOtpForgotPassRequest request,
        io.grpc.stub.StreamObserver<com.oscProject.CacheUserDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStoreOtpInCacheForgotPassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOtpForgotPass(com.oscProject.GetOtpForgotPassRequest request,
        io.grpc.stub.StreamObserver<com.oscProject.GetOtpForgotPassResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOtpForgotPassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserDetailsToChangePassword(com.oscProject.GetUserDetToChangePasswordRequest request,
        io.grpc.stub.StreamObserver<com.oscProject.GetUserDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserDetailsToChangePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clearCacheForForgotPassword(com.oscProject.GetPasswordRequest request,
        io.grpc.stub.StreamObserver<com.oscProject.GetCacheClearResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearCacheForForgotPasswordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CacheServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CacheServiceBlockingStub> {
    private CacheServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CacheServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CacheServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.oscProject.CacheUserDetailsResponse storeOtpUserIdInCache(com.oscProject.CacheUserDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreOtpUserIdInCacheMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.oscProject.GetOtpResponse getOtp(com.oscProject.GetOtpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOtpMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.oscProject.GetUserDetailsResponse getUserDetails(com.oscProject.GetUserDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.oscProject.GetCacheClearResponse clearCache(com.oscProject.GetUserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearCacheMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.oscProject.CacheUserDetailsResponse storeOtpInCacheForgotPass(com.oscProject.CacheOtpForgotPassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStoreOtpInCacheForgotPassMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.oscProject.GetOtpForgotPassResponse getOtpForgotPass(com.oscProject.GetOtpForgotPassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOtpForgotPassMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.oscProject.GetUserDetailsResponse getUserDetailsToChangePassword(com.oscProject.GetUserDetToChangePasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserDetailsToChangePasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.oscProject.GetCacheClearResponse clearCacheForForgotPassword(com.oscProject.GetPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearCacheForForgotPasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CacheServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CacheServiceFutureStub> {
    private CacheServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CacheServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CacheServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oscProject.CacheUserDetailsResponse> storeOtpUserIdInCache(
        com.oscProject.CacheUserDetailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreOtpUserIdInCacheMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oscProject.GetOtpResponse> getOtp(
        com.oscProject.GetOtpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOtpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oscProject.GetUserDetailsResponse> getUserDetails(
        com.oscProject.GetUserDetailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oscProject.GetCacheClearResponse> clearCache(
        com.oscProject.GetUserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearCacheMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oscProject.CacheUserDetailsResponse> storeOtpInCacheForgotPass(
        com.oscProject.CacheOtpForgotPassRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStoreOtpInCacheForgotPassMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oscProject.GetOtpForgotPassResponse> getOtpForgotPass(
        com.oscProject.GetOtpForgotPassRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOtpForgotPassMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oscProject.GetUserDetailsResponse> getUserDetailsToChangePassword(
        com.oscProject.GetUserDetToChangePasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserDetailsToChangePasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.oscProject.GetCacheClearResponse> clearCacheForForgotPassword(
        com.oscProject.GetPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearCacheForForgotPasswordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STORE_OTP_USER_ID_IN_CACHE = 0;
  private static final int METHODID_GET_OTP = 1;
  private static final int METHODID_GET_USER_DETAILS = 2;
  private static final int METHODID_CLEAR_CACHE = 3;
  private static final int METHODID_STORE_OTP_IN_CACHE_FORGOT_PASS = 4;
  private static final int METHODID_GET_OTP_FORGOT_PASS = 5;
  private static final int METHODID_GET_USER_DETAILS_TO_CHANGE_PASSWORD = 6;
  private static final int METHODID_CLEAR_CACHE_FOR_FORGOT_PASSWORD = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CacheServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CacheServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STORE_OTP_USER_ID_IN_CACHE:
          serviceImpl.storeOtpUserIdInCache((com.oscProject.CacheUserDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.oscProject.CacheUserDetailsResponse>) responseObserver);
          break;
        case METHODID_GET_OTP:
          serviceImpl.getOtp((com.oscProject.GetOtpRequest) request,
              (io.grpc.stub.StreamObserver<com.oscProject.GetOtpResponse>) responseObserver);
          break;
        case METHODID_GET_USER_DETAILS:
          serviceImpl.getUserDetails((com.oscProject.GetUserDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.oscProject.GetUserDetailsResponse>) responseObserver);
          break;
        case METHODID_CLEAR_CACHE:
          serviceImpl.clearCache((com.oscProject.GetUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.oscProject.GetCacheClearResponse>) responseObserver);
          break;
        case METHODID_STORE_OTP_IN_CACHE_FORGOT_PASS:
          serviceImpl.storeOtpInCacheForgotPass((com.oscProject.CacheOtpForgotPassRequest) request,
              (io.grpc.stub.StreamObserver<com.oscProject.CacheUserDetailsResponse>) responseObserver);
          break;
        case METHODID_GET_OTP_FORGOT_PASS:
          serviceImpl.getOtpForgotPass((com.oscProject.GetOtpForgotPassRequest) request,
              (io.grpc.stub.StreamObserver<com.oscProject.GetOtpForgotPassResponse>) responseObserver);
          break;
        case METHODID_GET_USER_DETAILS_TO_CHANGE_PASSWORD:
          serviceImpl.getUserDetailsToChangePassword((com.oscProject.GetUserDetToChangePasswordRequest) request,
              (io.grpc.stub.StreamObserver<com.oscProject.GetUserDetailsResponse>) responseObserver);
          break;
        case METHODID_CLEAR_CACHE_FOR_FORGOT_PASSWORD:
          serviceImpl.clearCacheForForgotPassword((com.oscProject.GetPasswordRequest) request,
              (io.grpc.stub.StreamObserver<com.oscProject.GetCacheClearResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CacheServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CacheServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.oscProject.Cache.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CacheService");
    }
  }

  private static final class CacheServiceFileDescriptorSupplier
      extends CacheServiceBaseDescriptorSupplier {
    CacheServiceFileDescriptorSupplier() {}
  }

  private static final class CacheServiceMethodDescriptorSupplier
      extends CacheServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CacheServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CacheServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CacheServiceFileDescriptorSupplier())
              .addMethod(getStoreOtpUserIdInCacheMethod())
              .addMethod(getGetOtpMethod())
              .addMethod(getGetUserDetailsMethod())
              .addMethod(getClearCacheMethod())
              .addMethod(getStoreOtpInCacheForgotPassMethod())
              .addMethod(getGetOtpForgotPassMethod())
              .addMethod(getGetUserDetailsToChangePasswordMethod())
              .addMethod(getClearCacheForForgotPasswordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
