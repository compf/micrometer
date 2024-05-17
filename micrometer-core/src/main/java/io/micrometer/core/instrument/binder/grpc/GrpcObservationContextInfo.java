package io.micrometer.core.instrument.binder.grpc;

import io.grpc.Metadata;
import io.grpc.MethodDescriptor.MethodType;
import io.grpc.Status.Code;
import io.micrometer.common.lang.Nullable;

/**
 * Holds information relevant to gRPC client and server observation contexts.
 */
public class GrpcObservationContextInfo {
    
    private final String serviceName;
    private final String methodName;
    private final String fullMethodName;
    private final MethodType methodType;
    private final Code statusCode;
    private final String authority;
    private final Metadata headers;
    private final Metadata trailers;

    public GrpcObservationContextInfo(String serviceName, String methodName, String fullMethodName,
                                      MethodType methodType, Code statusCode, String authority,
                                      Metadata headers, Metadata trailers) {
        this.serviceName = serviceName;
        this.methodName = methodName;
        this.fullMethodName = fullMethodName;
        this.methodType = methodType;
        this.statusCode = statusCode;
        this.authority = authority;
        this.headers = headers;
        this.trailers = trailers;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public String getFullMethodName() {
        return fullMethodName;
    }

    public MethodType getMethodType() {
        return methodType;
    }

    @Nullable
    public Code getStatusCode() {
        return statusCode;
    }

    public String getAuthority() {
        return authority;
    }

    public Metadata getHeaders() {
        return headers;
    }

    public Metadata getTrailers() {
        return trailers;
    }
}