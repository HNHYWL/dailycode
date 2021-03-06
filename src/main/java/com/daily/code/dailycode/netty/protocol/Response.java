// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BaseResponseProto.proto

package com.daily.code.dailycode.netty.protocol;

public final class Response {
  private Response() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CIMResProtocolOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int64 responseId = 2;
    /**
     * <code>required int64 responseId = 2;</code>
     */
    boolean hasResponseId();
    /**
     * <code>required int64 responseId = 2;</code>
     */
    long getResponseId();

    // required string resMsg = 1;
    /**
     * <code>required string resMsg = 1;</code>
     */
    boolean hasResMsg();
    /**
     * <code>required string resMsg = 1;</code>
     */
    java.lang.String getResMsg();
    /**
     * <code>required string resMsg = 1;</code>
     */
    com.google.protobuf.ByteString
        getResMsgBytes();

    // required int32 type = 3;
    /**
     * <code>required int32 type = 3;</code>
     */
    boolean hasType();
    /**
     * <code>required int32 type = 3;</code>
     */
    int getType();
  }
  /**
   * Protobuf type {@code CIMResProtocol}
   */
  public static final class CIMResProtocol extends
      com.google.protobuf.GeneratedMessage
      implements CIMResProtocolOrBuilder {
    // Use CIMResProtocol.newBuilder() to construct.
    private CIMResProtocol(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CIMResProtocol(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CIMResProtocol defaultInstance;
    public static CIMResProtocol getDefaultInstance() {
      return defaultInstance;
    }

    public CIMResProtocol getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CIMResProtocol(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000002;
              resMsg_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000001;
              responseId_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              type_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.daily.code.dailycode.netty.protocol.Response.internal_static_CIMResProtocol_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.daily.code.dailycode.netty.protocol.Response.internal_static_CIMResProtocol_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol.class, com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol.Builder.class);
    }

    public static com.google.protobuf.Parser<CIMResProtocol> PARSER =
        new com.google.protobuf.AbstractParser<CIMResProtocol>() {
      public CIMResProtocol parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CIMResProtocol(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CIMResProtocol> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int64 responseId = 2;
    public static final int RESPONSEID_FIELD_NUMBER = 2;
    private long responseId_;
    /**
     * <code>required int64 responseId = 2;</code>
     */
    public boolean hasResponseId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 responseId = 2;</code>
     */
    public long getResponseId() {
      return responseId_;
    }

    // required string resMsg = 1;
    public static final int RESMSG_FIELD_NUMBER = 1;
    private java.lang.Object resMsg_;
    /**
     * <code>required string resMsg = 1;</code>
     */
    public boolean hasResMsg() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string resMsg = 1;</code>
     */
    public java.lang.String getResMsg() {
      java.lang.Object ref = resMsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          resMsg_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string resMsg = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResMsgBytes() {
      java.lang.Object ref = resMsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required int32 type = 3;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <code>required int32 type = 3;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 type = 3;</code>
     */
    public int getType() {
      return type_;
    }

    private void initFields() {
      responseId_ = 0L;
      resMsg_ = "";
      type_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasResponseId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasResMsg()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(1, getResMsgBytes());
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(2, responseId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, type_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getResMsgBytes());
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, responseId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, type_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CIMResProtocol}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.daily.code.dailycode.netty.protocol.Response.CIMResProtocolOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.daily.code.dailycode.netty.protocol.Response.internal_static_CIMResProtocol_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.daily.code.dailycode.netty.protocol.Response.internal_static_CIMResProtocol_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol.class, com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol.Builder.class);
      }

      // Construct using com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        responseId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        resMsg_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.daily.code.dailycode.netty.protocol.Response.internal_static_CIMResProtocol_descriptor;
      }

      public com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol getDefaultInstanceForType() {
        return com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol.getDefaultInstance();
      }

      public com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol build() {
        com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol buildPartial() {
        com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol result = new com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.responseId_ = responseId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.resMsg_ = resMsg_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol) {
          return mergeFrom((com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol other) {
        if (other == com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol.getDefaultInstance()) return this;
        if (other.hasResponseId()) {
          setResponseId(other.getResponseId());
        }
        if (other.hasResMsg()) {
          bitField0_ |= 0x00000002;
          resMsg_ = other.resMsg_;
          onChanged();
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasResponseId()) {
          
          return false;
        }
        if (!hasResMsg()) {
          
          return false;
        }
        if (!hasType()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.daily.code.dailycode.netty.protocol.Response.CIMResProtocol) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int64 responseId = 2;
      private long responseId_ ;
      /**
       * <code>required int64 responseId = 2;</code>
       */
      public boolean hasResponseId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 responseId = 2;</code>
       */
      public long getResponseId() {
        return responseId_;
      }
      /**
       * <code>required int64 responseId = 2;</code>
       */
      public Builder setResponseId(long value) {
        bitField0_ |= 0x00000001;
        responseId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 responseId = 2;</code>
       */
      public Builder clearResponseId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        responseId_ = 0L;
        onChanged();
        return this;
      }

      // required string resMsg = 1;
      private java.lang.Object resMsg_ = "";
      /**
       * <code>required string resMsg = 1;</code>
       */
      public boolean hasResMsg() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string resMsg = 1;</code>
       */
      public java.lang.String getResMsg() {
        java.lang.Object ref = resMsg_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          resMsg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string resMsg = 1;</code>
       */
      public com.google.protobuf.ByteString
          getResMsgBytes() {
        java.lang.Object ref = resMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          resMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string resMsg = 1;</code>
       */
      public Builder setResMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        resMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string resMsg = 1;</code>
       */
      public Builder clearResMsg() {
        bitField0_ = (bitField0_ & ~0x00000002);
        resMsg_ = getDefaultInstance().getResMsg();
        onChanged();
        return this;
      }
      /**
       * <code>required string resMsg = 1;</code>
       */
      public Builder setResMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        resMsg_ = value;
        onChanged();
        return this;
      }

      // required int32 type = 3;
      private int type_ ;
      /**
       * <code>required int32 type = 3;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 type = 3;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>required int32 type = 3;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000004;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 type = 3;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:CIMResProtocol)
    }

    static {
      defaultInstance = new CIMResProtocol(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:CIMResProtocol)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_CIMResProtocol_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_CIMResProtocol_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027BaseResponseProto.proto\"B\n\016CIMResProto" +
      "col\022\022\n\nresponseId\030\002 \002(\003\022\016\n\006resMsg\030\001 \002(\t\022" +
      "\014\n\004type\030\003 \002(\005B-\n!com.daily.code.dailycod" +
      "e.protocolB\010Response"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_CIMResProtocol_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_CIMResProtocol_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_CIMResProtocol_descriptor,
              new java.lang.String[] { "ResponseId", "ResMsg", "Type", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
