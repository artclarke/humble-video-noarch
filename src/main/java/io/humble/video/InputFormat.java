/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
public class InputFormat extends ContainerFormat {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected InputFormat(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.SWIGInputFormatUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected InputFormat(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.SWIGInputFormatUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  protected static long getCPtr(InputFormat obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  protected long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new InputFormat object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public InputFormat copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new InputFormat(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof InputFormat)
      equal = (((InputFormat)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  

/**
 * Name for format.  
 */
  public String getName() {
    return VideoJNI.InputFormat_getName(swigCPtr, this);
  }

/**
 * Descriptive name for the format, meant to be more human-readable 
 *  
 * than name.  
 */
  public String getLongName() {
    return VideoJNI.InputFormat_getLongName(swigCPtr, this);
  }

/**
 * A comma-separated list of supported filename extensions  
 */
  public String getExtensions() {
    return VideoJNI.InputFormat_getExtensions(swigCPtr, this);
  }

/**
 * Flags that tell you what capabilities this format supports.  
 * @return	a bitmask of {@link Flags}  
 */
  public int getFlags() {
    return VideoJNI.InputFormat_getFlags(swigCPtr, this);
  }

/**
 *  
 */
  protected int getNumSupportedCodecs() {
    return VideoJNI.InputFormat_getNumSupportedCodecs(swigCPtr, this);
  }

/**
 *  
 * @param	n The n'th codec supported by this codec. Lower n are higher 
 *		 priority.  
 * n must be < {@link #getNumSupportedCodecs()}  
 * @return	the {@link CodecId} at the n'th slot, or {@link CodecId.ID_NONE} 
 *		 if none.  
 */
  protected Codec.Id getSupportedCodecId(int n) {
    return Codec.Id.swigToEnum(VideoJNI.InputFormat_getSupportedCodecId(swigCPtr, this, n));
  }

/**
 * Get the 32-bit Codec Tag for the n'th codec supported by this container. 
 *  
 * @param	n The n'th codec supported by this codec. Lower n are higher 
 *		 priority.  
 * n must be < {@link #getNumSupportedCodecs()}  
 * @return	the codec tag at the n'th slot, or 0 if none.  
 */
  protected long getSupportedCodecTag(int n) {
    return VideoJNI.InputFormat_getSupportedCodecTag(swigCPtr, this, n);
  }

/**
 * Find {@link InputFormat} based on the short name of the input format. 
 *  
 * @return	An {@link InputFormat} or null if none found.  
 */
  public static InputFormat findFormat(String shortName) {
    long cPtr = VideoJNI.InputFormat_findFormat(shortName);
    return (cPtr == 0) ? null : new InputFormat(cPtr, false);
  }

}
