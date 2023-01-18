// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: definition.proto

package com.stone98.example.grpc.proto;

/**
 * <pre>
 * A latitude-longitude rectangle, represented as two diagonally opposite
 * points "lo" and "hi".
 * </pre>
 *
 * Protobuf type {@code routeguide.Rectangle}
 */
public final class Rectangle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:routeguide.Rectangle)
    RectangleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Rectangle.newBuilder() to construct.
  private Rectangle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Rectangle() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Rectangle();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Rectangle(
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
            com.stone98.example.grpc.proto.Point.Builder subBuilder = null;
            if (lo_ != null) {
              subBuilder = lo_.toBuilder();
            }
            lo_ = input.readMessage(com.stone98.example.grpc.proto.Point.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lo_);
              lo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.stone98.example.grpc.proto.Point.Builder subBuilder = null;
            if (hi_ != null) {
              subBuilder = hi_.toBuilder();
            }
            hi_ = input.readMessage(com.stone98.example.grpc.proto.Point.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(hi_);
              hi_ = subBuilder.buildPartial();
            }

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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.stone98.example.grpc.proto.RouteGuideProto.internal_static_routeguide_Rectangle_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stone98.example.grpc.proto.RouteGuideProto.internal_static_routeguide_Rectangle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stone98.example.grpc.proto.Rectangle.class, com.stone98.example.grpc.proto.Rectangle.Builder.class);
  }

  public static final int LO_FIELD_NUMBER = 1;
  private com.stone98.example.grpc.proto.Point lo_;
  /**
   * <pre>
   * One corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point lo = 1;</code>
   * @return Whether the lo field is set.
   */
  @java.lang.Override
  public boolean hasLo() {
    return lo_ != null;
  }
  /**
   * <pre>
   * One corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point lo = 1;</code>
   * @return The lo.
   */
  @java.lang.Override
  public com.stone98.example.grpc.proto.Point getLo() {
    return lo_ == null ? com.stone98.example.grpc.proto.Point.getDefaultInstance() : lo_;
  }
  /**
   * <pre>
   * One corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point lo = 1;</code>
   */
  @java.lang.Override
  public com.stone98.example.grpc.proto.PointOrBuilder getLoOrBuilder() {
    return getLo();
  }

  public static final int HI_FIELD_NUMBER = 2;
  private com.stone98.example.grpc.proto.Point hi_;
  /**
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point hi = 2;</code>
   * @return Whether the hi field is set.
   */
  @java.lang.Override
  public boolean hasHi() {
    return hi_ != null;
  }
  /**
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point hi = 2;</code>
   * @return The hi.
   */
  @java.lang.Override
  public com.stone98.example.grpc.proto.Point getHi() {
    return hi_ == null ? com.stone98.example.grpc.proto.Point.getDefaultInstance() : hi_;
  }
  /**
   * <pre>
   * The other corner of the rectangle.
   * </pre>
   *
   * <code>.routeguide.Point hi = 2;</code>
   */
  @java.lang.Override
  public com.stone98.example.grpc.proto.PointOrBuilder getHiOrBuilder() {
    return getHi();
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
    if (lo_ != null) {
      output.writeMessage(1, getLo());
    }
    if (hi_ != null) {
      output.writeMessage(2, getHi());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLo());
    }
    if (hi_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHi());
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
    if (!(obj instanceof com.stone98.example.grpc.proto.Rectangle)) {
      return super.equals(obj);
    }
    com.stone98.example.grpc.proto.Rectangle other = (com.stone98.example.grpc.proto.Rectangle) obj;

    if (hasLo() != other.hasLo()) return false;
    if (hasLo()) {
      if (!getLo()
          .equals(other.getLo())) return false;
    }
    if (hasHi() != other.hasHi()) return false;
    if (hasHi()) {
      if (!getHi()
          .equals(other.getHi())) return false;
    }
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
    if (hasLo()) {
      hash = (37 * hash) + LO_FIELD_NUMBER;
      hash = (53 * hash) + getLo().hashCode();
    }
    if (hasHi()) {
      hash = (37 * hash) + HI_FIELD_NUMBER;
      hash = (53 * hash) + getHi().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stone98.example.grpc.proto.Rectangle parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stone98.example.grpc.proto.Rectangle parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stone98.example.grpc.proto.Rectangle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stone98.example.grpc.proto.Rectangle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stone98.example.grpc.proto.Rectangle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stone98.example.grpc.proto.Rectangle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stone98.example.grpc.proto.Rectangle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stone98.example.grpc.proto.Rectangle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stone98.example.grpc.proto.Rectangle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.stone98.example.grpc.proto.Rectangle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stone98.example.grpc.proto.Rectangle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stone98.example.grpc.proto.Rectangle parseFrom(
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
  public static Builder newBuilder(com.stone98.example.grpc.proto.Rectangle prototype) {
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
   * <pre>
   * A latitude-longitude rectangle, represented as two diagonally opposite
   * points "lo" and "hi".
   * </pre>
   *
   * Protobuf type {@code routeguide.Rectangle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:routeguide.Rectangle)
      com.stone98.example.grpc.proto.RectangleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stone98.example.grpc.proto.RouteGuideProto.internal_static_routeguide_Rectangle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stone98.example.grpc.proto.RouteGuideProto.internal_static_routeguide_Rectangle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stone98.example.grpc.proto.Rectangle.class, com.stone98.example.grpc.proto.Rectangle.Builder.class);
    }

    // Construct using com.stone98.example.grpc.proto.Rectangle.newBuilder()
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
      if (loBuilder_ == null) {
        lo_ = null;
      } else {
        lo_ = null;
        loBuilder_ = null;
      }
      if (hiBuilder_ == null) {
        hi_ = null;
      } else {
        hi_ = null;
        hiBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stone98.example.grpc.proto.RouteGuideProto.internal_static_routeguide_Rectangle_descriptor;
    }

    @java.lang.Override
    public com.stone98.example.grpc.proto.Rectangle getDefaultInstanceForType() {
      return com.stone98.example.grpc.proto.Rectangle.getDefaultInstance();
    }

    @java.lang.Override
    public com.stone98.example.grpc.proto.Rectangle build() {
      com.stone98.example.grpc.proto.Rectangle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stone98.example.grpc.proto.Rectangle buildPartial() {
      com.stone98.example.grpc.proto.Rectangle result = new com.stone98.example.grpc.proto.Rectangle(this);
      if (loBuilder_ == null) {
        result.lo_ = lo_;
      } else {
        result.lo_ = loBuilder_.build();
      }
      if (hiBuilder_ == null) {
        result.hi_ = hi_;
      } else {
        result.hi_ = hiBuilder_.build();
      }
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
      if (other instanceof com.stone98.example.grpc.proto.Rectangle) {
        return mergeFrom((com.stone98.example.grpc.proto.Rectangle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stone98.example.grpc.proto.Rectangle other) {
      if (other == com.stone98.example.grpc.proto.Rectangle.getDefaultInstance()) return this;
      if (other.hasLo()) {
        mergeLo(other.getLo());
      }
      if (other.hasHi()) {
        mergeHi(other.getHi());
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
      com.stone98.example.grpc.proto.Rectangle parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.stone98.example.grpc.proto.Rectangle) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.stone98.example.grpc.proto.Point lo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stone98.example.grpc.proto.Point, com.stone98.example.grpc.proto.Point.Builder, com.stone98.example.grpc.proto.PointOrBuilder> loBuilder_;
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     * @return Whether the lo field is set.
     */
    public boolean hasLo() {
      return loBuilder_ != null || lo_ != null;
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     * @return The lo.
     */
    public com.stone98.example.grpc.proto.Point getLo() {
      if (loBuilder_ == null) {
        return lo_ == null ? com.stone98.example.grpc.proto.Point.getDefaultInstance() : lo_;
      } else {
        return loBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Builder setLo(com.stone98.example.grpc.proto.Point value) {
      if (loBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lo_ = value;
        onChanged();
      } else {
        loBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Builder setLo(
        com.stone98.example.grpc.proto.Point.Builder builderForValue) {
      if (loBuilder_ == null) {
        lo_ = builderForValue.build();
        onChanged();
      } else {
        loBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Builder mergeLo(com.stone98.example.grpc.proto.Point value) {
      if (loBuilder_ == null) {
        if (lo_ != null) {
          lo_ =
            com.stone98.example.grpc.proto.Point.newBuilder(lo_).mergeFrom(value).buildPartial();
        } else {
          lo_ = value;
        }
        onChanged();
      } else {
        loBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public Builder clearLo() {
      if (loBuilder_ == null) {
        lo_ = null;
        onChanged();
      } else {
        lo_ = null;
        loBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public com.stone98.example.grpc.proto.Point.Builder getLoBuilder() {
      
      onChanged();
      return getLoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    public com.stone98.example.grpc.proto.PointOrBuilder getLoOrBuilder() {
      if (loBuilder_ != null) {
        return loBuilder_.getMessageOrBuilder();
      } else {
        return lo_ == null ?
            com.stone98.example.grpc.proto.Point.getDefaultInstance() : lo_;
      }
    }
    /**
     * <pre>
     * One corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point lo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stone98.example.grpc.proto.Point, com.stone98.example.grpc.proto.Point.Builder, com.stone98.example.grpc.proto.PointOrBuilder> 
        getLoFieldBuilder() {
      if (loBuilder_ == null) {
        loBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.stone98.example.grpc.proto.Point, com.stone98.example.grpc.proto.Point.Builder, com.stone98.example.grpc.proto.PointOrBuilder>(
                getLo(),
                getParentForChildren(),
                isClean());
        lo_ = null;
      }
      return loBuilder_;
    }

    private com.stone98.example.grpc.proto.Point hi_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stone98.example.grpc.proto.Point, com.stone98.example.grpc.proto.Point.Builder, com.stone98.example.grpc.proto.PointOrBuilder> hiBuilder_;
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     * @return Whether the hi field is set.
     */
    public boolean hasHi() {
      return hiBuilder_ != null || hi_ != null;
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     * @return The hi.
     */
    public com.stone98.example.grpc.proto.Point getHi() {
      if (hiBuilder_ == null) {
        return hi_ == null ? com.stone98.example.grpc.proto.Point.getDefaultInstance() : hi_;
      } else {
        return hiBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Builder setHi(com.stone98.example.grpc.proto.Point value) {
      if (hiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hi_ = value;
        onChanged();
      } else {
        hiBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Builder setHi(
        com.stone98.example.grpc.proto.Point.Builder builderForValue) {
      if (hiBuilder_ == null) {
        hi_ = builderForValue.build();
        onChanged();
      } else {
        hiBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Builder mergeHi(com.stone98.example.grpc.proto.Point value) {
      if (hiBuilder_ == null) {
        if (hi_ != null) {
          hi_ =
            com.stone98.example.grpc.proto.Point.newBuilder(hi_).mergeFrom(value).buildPartial();
        } else {
          hi_ = value;
        }
        onChanged();
      } else {
        hiBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public Builder clearHi() {
      if (hiBuilder_ == null) {
        hi_ = null;
        onChanged();
      } else {
        hi_ = null;
        hiBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public com.stone98.example.grpc.proto.Point.Builder getHiBuilder() {
      
      onChanged();
      return getHiFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    public com.stone98.example.grpc.proto.PointOrBuilder getHiOrBuilder() {
      if (hiBuilder_ != null) {
        return hiBuilder_.getMessageOrBuilder();
      } else {
        return hi_ == null ?
            com.stone98.example.grpc.proto.Point.getDefaultInstance() : hi_;
      }
    }
    /**
     * <pre>
     * The other corner of the rectangle.
     * </pre>
     *
     * <code>.routeguide.Point hi = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.stone98.example.grpc.proto.Point, com.stone98.example.grpc.proto.Point.Builder, com.stone98.example.grpc.proto.PointOrBuilder> 
        getHiFieldBuilder() {
      if (hiBuilder_ == null) {
        hiBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.stone98.example.grpc.proto.Point, com.stone98.example.grpc.proto.Point.Builder, com.stone98.example.grpc.proto.PointOrBuilder>(
                getHi(),
                getParentForChildren(),
                isClean());
        hi_ = null;
      }
      return hiBuilder_;
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


    // @@protoc_insertion_point(builder_scope:routeguide.Rectangle)
  }

  // @@protoc_insertion_point(class_scope:routeguide.Rectangle)
  private static final com.stone98.example.grpc.proto.Rectangle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stone98.example.grpc.proto.Rectangle();
  }

  public static com.stone98.example.grpc.proto.Rectangle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Rectangle>
      PARSER = new com.google.protobuf.AbstractParser<Rectangle>() {
    @java.lang.Override
    public Rectangle parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Rectangle(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Rectangle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Rectangle> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stone98.example.grpc.proto.Rectangle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
