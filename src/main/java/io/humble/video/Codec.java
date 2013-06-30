/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
/**
 * A codec that can be used either to encode raw data into compressed 
 * bitstreams,  
 * or decode compressed data into raw data, or both!  
 */
public class Codec extends RefCounted {
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
  protected Codec(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.SWIGCodecUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected Codec(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.SWIGCodecUpcast(cPtr),
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
  protected static long getCPtr(Codec obj) {
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
   * Create a new Codec object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public Codec copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new Codec(swigCPtr, swigCMemOwn, getJavaRefCount());
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
    if (obj instanceof Codec)
      equal = (((Codec)obj).swigCPtr == this.swigCPtr);
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
 * Checks if this codec has the given capability.  
 * @param	c Capability to check.  
 */
  public boolean hasCapability(Codec.CodecCapability c) {
    return VideoJNI.Codec_hasCapability(swigCPtr, this, c.swigValue());
  }

  public enum Id {
  /**
   * Identify the syntax and semantics of the bitstream.
   * The principle is roughly:
   * Two decoders with the same ID can decode the same streams.
   * Two encoders with the same ID can encode compatible streams.
   * There may be slight deviations from the principle due to implementation 
   *
   * details.
   * From Ffmpeg 1.2.1
   */
    ID_NONE,
    ID_MPEG1VIDEO,
    ID_MPEG2VIDEO,
    ID_MPEG2VIDEO_XVMC,
    ID_H261,
    ID_H263,
    ID_RV10,
    ID_RV20,
    ID_MJPEG,
    ID_MJPEGB,
    ID_LJPEG,
    ID_SP5X,
    ID_JPEGLS,
    ID_MPEG4,
    ID_RAWVIDEO,
    ID_MSMPEG4V1,
    ID_MSMPEG4V2,
    ID_MSMPEG4V3,
    ID_WMV1,
    ID_WMV2,
    ID_H263P,
    ID_H263I,
    ID_FLV1,
    ID_SVQ1,
    ID_SVQ3,
    ID_DVVIDEO,
    ID_HUFFYUV,
    ID_CYUV,
    ID_H264,
    ID_INDEO3,
    ID_VP3,
    ID_THEORA,
    ID_ASV1,
    ID_ASV2,
    ID_FFV1,
    ID_4XM,
    ID_VCR1,
    ID_CLJR,
    ID_MDEC,
    ID_ROQ,
    ID_INTERPLAY_VIDEO,
    ID_XAN_WC3,
    ID_XAN_WC4,
    ID_RPZA,
    ID_CINEPAK,
    ID_WS_VQA,
    ID_MSRLE,
    ID_MSVIDEO1,
    ID_IDCIN,
    ID_8BPS,
    ID_SMC,
    ID_FLIC,
    ID_TRUEMOTION1,
    ID_VMDVIDEO,
    ID_MSZH,
    ID_ZLIB,
    ID_QTRLE,
    ID_SNOW,
    ID_TSCC,
    ID_ULTI,
    ID_QDRAW,
    ID_VIXL,
    ID_QPEG,
    ID_PNG,
    ID_PPM,
    ID_PBM,
    ID_PGM,
    ID_PGMYUV,
    ID_PAM,
    ID_FFVHUFF,
    ID_RV30,
    ID_RV40,
    ID_VC1,
    ID_WMV3,
    ID_LOCO,
    ID_WNV1,
    ID_AASC,
    ID_INDEO2,
    ID_FRAPS,
    ID_TRUEMOTION2,
    ID_BMP,
    ID_CSCD,
    ID_MMVIDEO,
    ID_ZMBV,
    ID_AVS,
    ID_SMACKVIDEO,
    ID_NUV,
    ID_KMVC,
    ID_FLASHSV,
    ID_CAVS,
    ID_JPEG2000,
    ID_VMNC,
    ID_VP5,
    ID_VP6,
    ID_VP6F,
    ID_TARGA,
    ID_DSICINVIDEO,
    ID_TIERTEXSEQVIDEO,
    ID_TIFF,
    ID_GIF,
    ID_DXA,
    ID_DNXHD,
    ID_THP,
    ID_SGI,
    ID_C93,
    ID_BETHSOFTVID,
    ID_PTX,
    ID_TXD,
    ID_VP6A,
    ID_AMV,
    ID_VB,
    ID_PCX,
    ID_SUNRAST,
    ID_INDEO4,
    ID_INDEO5,
    ID_MIMIC,
    ID_RL2,
    ID_ESCAPE124,
    ID_DIRAC,
    ID_BFI,
    ID_CMV,
    ID_MOTIONPIXELS,
    ID_TGV,
    ID_TGQ,
    ID_TQI,
    ID_AURA,
    ID_AURA2,
    ID_V210X,
    ID_TMV,
    ID_V210,
    ID_DPX,
    ID_MAD,
    ID_FRWU,
    ID_FLASHSV2,
    ID_CDGRAPHICS,
    ID_R210,
    ID_ANM,
    ID_BINKVIDEO,
    ID_IFF_ILBM,
    ID_IFF_BYTERUN1,
    ID_KGV1,
    ID_YOP,
    ID_VP8,
    ID_PICTOR,
    ID_ANSI,
    ID_A64_MULTI,
    ID_A64_MULTI5,
    ID_R10K,
    ID_MXPEG,
    ID_LAGARITH,
    ID_PRORES,
    ID_JV,
    ID_DFA,
    ID_WMV3IMAGE,
    ID_VC1IMAGE,
    ID_UTVIDEO,
    ID_BMV_VIDEO,
    ID_VBLE,
    ID_DXTORY,
    ID_V410,
    ID_XWD,
    ID_CDXL,
    ID_XBM,
    ID_ZEROCODEC,
    ID_MSS1,
    ID_MSA1,
    ID_TSCC2,
    ID_MTS2,
    ID_CLLC,
    ID_MSS2,
    ID_VP9,
    ID_BRENDER_PIX(VideoJNI.Codec_ID_BRENDER_PIX_get()),
    ID_Y41P(VideoJNI.Codec_ID_Y41P_get()),
    ID_ESCAPE130(VideoJNI.Codec_ID_ESCAPE130_get()),
    ID_EXR(VideoJNI.Codec_ID_EXR_get()),
    ID_AVRP(VideoJNI.Codec_ID_AVRP_get()),
    ID_012V(VideoJNI.Codec_ID_012V_get()),
    ID_G2M(VideoJNI.Codec_ID_G2M_get()),
    ID_AVUI(VideoJNI.Codec_ID_AVUI_get()),
    ID_AYUV(VideoJNI.Codec_ID_AYUV_get()),
    ID_TARGA_Y216(VideoJNI.Codec_ID_TARGA_Y216_get()),
    ID_V308(VideoJNI.Codec_ID_V308_get()),
    ID_V408(VideoJNI.Codec_ID_V408_get()),
    ID_YUV4(VideoJNI.Codec_ID_YUV4_get()),
    ID_SANM(VideoJNI.Codec_ID_SANM_get()),
    ID_PAF_VIDEO(VideoJNI.Codec_ID_PAF_VIDEO_get()),
    ID_AVRN(VideoJNI.Codec_ID_AVRN_get()),
    ID_CPIA(VideoJNI.Codec_ID_CPIA_get()),
    ID_XFACE(VideoJNI.Codec_ID_XFACE_get()),
    ID_SGIRLE(VideoJNI.Codec_ID_SGIRLE_get()),
    ID_MVC1(VideoJNI.Codec_ID_MVC1_get()),
    ID_MVC2(VideoJNI.Codec_ID_MVC2_get()),
    ID_FIRST_AUDIO(VideoJNI.Codec_ID_FIRST_AUDIO_get()),
    ID_PCM_S16LE(VideoJNI.Codec_ID_PCM_S16LE_get()),
    ID_PCM_S16BE,
    ID_PCM_U16LE,
    ID_PCM_U16BE,
    ID_PCM_S8,
    ID_PCM_U8,
    ID_PCM_MULAW,
    ID_PCM_ALAW,
    ID_PCM_S32LE,
    ID_PCM_S32BE,
    ID_PCM_U32LE,
    ID_PCM_U32BE,
    ID_PCM_S24LE,
    ID_PCM_S24BE,
    ID_PCM_U24LE,
    ID_PCM_U24BE,
    ID_PCM_S24DAUD,
    ID_PCM_ZORK,
    ID_PCM_S16LE_PLANAR,
    ID_PCM_DVD,
    ID_PCM_F32BE,
    ID_PCM_F32LE,
    ID_PCM_F64BE,
    ID_PCM_F64LE,
    ID_PCM_BLURAY,
    ID_PCM_LXF,
    ID_S302M,
    ID_PCM_S8_PLANAR,
    ID_PCM_S24LE_PLANAR(VideoJNI.Codec_ID_PCM_S24LE_PLANAR_get()),
    ID_PCM_S32LE_PLANAR(VideoJNI.Codec_ID_PCM_S32LE_PLANAR_get()),
    ID_PCM_S16BE_PLANAR(VideoJNI.Codec_ID_PCM_S16BE_PLANAR_get()),
    ID_ADPCM_IMA_QT(VideoJNI.Codec_ID_ADPCM_IMA_QT_get()),
    ID_ADPCM_IMA_WAV,
    ID_ADPCM_IMA_DK3,
    ID_ADPCM_IMA_DK4,
    ID_ADPCM_IMA_WS,
    ID_ADPCM_IMA_SMJPEG,
    ID_ADPCM_MS,
    ID_ADPCM_4XM,
    ID_ADPCM_XA,
    ID_ADPCM_ADX,
    ID_ADPCM_EA,
    ID_ADPCM_G726,
    ID_ADPCM_CT,
    ID_ADPCM_SWF,
    ID_ADPCM_YAMAHA,
    ID_ADPCM_SBPRO_4,
    ID_ADPCM_SBPRO_3,
    ID_ADPCM_SBPRO_2,
    ID_ADPCM_THP,
    ID_ADPCM_IMA_AMV,
    ID_ADPCM_EA_R1,
    ID_ADPCM_EA_R3,
    ID_ADPCM_EA_R2,
    ID_ADPCM_IMA_EA_SEAD,
    ID_ADPCM_IMA_EA_EACS,
    ID_ADPCM_EA_XAS,
    ID_ADPCM_EA_MAXIS_XA,
    ID_ADPCM_IMA_ISS,
    ID_ADPCM_G722,
    ID_ADPCM_IMA_APC,
    ID_VIMA(VideoJNI.Codec_ID_VIMA_get()),
    ID_ADPCM_AFC(VideoJNI.Codec_ID_ADPCM_AFC_get()),
    ID_ADPCM_IMA_OKI(VideoJNI.Codec_ID_ADPCM_IMA_OKI_get()),
    ID_AMR_NB(VideoJNI.Codec_ID_AMR_NB_get()),
    ID_AMR_WB,
    ID_RA_144(VideoJNI.Codec_ID_RA_144_get()),
    ID_RA_288,
    ID_ROQ_DPCM(VideoJNI.Codec_ID_ROQ_DPCM_get()),
    ID_INTERPLAY_DPCM,
    ID_XAN_DPCM,
    ID_SOL_DPCM,
    ID_MP2(VideoJNI.Codec_ID_MP2_get()),
    ID_MP3,
    ID_AAC,
    ID_AC3,
    ID_DTS,
    ID_VORBIS,
    ID_DVAUDIO,
    ID_WMAV1,
    ID_WMAV2,
    ID_MACE3,
    ID_MACE6,
    ID_VMDAUDIO,
    ID_FLAC,
    ID_MP3ADU,
    ID_MP3ON4,
    ID_SHORTEN,
    ID_ALAC,
    ID_WESTWOOD_SND1,
    ID_GSM,
    ID_QDM2,
    ID_COOK,
    ID_TRUESPEECH,
    ID_TTA,
    ID_SMACKAUDIO,
    ID_QCELP,
    ID_WAVPACK,
    ID_DSICINAUDIO,
    ID_IMC,
    ID_MUSEPACK7,
    ID_MLP,
    ID_GSM_MS,
    ID_ATRAC3,
    ID_VOXWARE,
    ID_APE,
    ID_NELLYMOSER,
    ID_MUSEPACK8,
    ID_SPEEX,
    ID_WMAVOICE,
    ID_WMAPRO,
    ID_WMALOSSLESS,
    ID_ATRAC3P,
    ID_EAC3,
    ID_SIPR,
    ID_MP1,
    ID_TWINVQ,
    ID_TRUEHD,
    ID_MP4ALS,
    ID_ATRAC1,
    ID_BINKAUDIO_RDFT,
    ID_BINKAUDIO_DCT,
    ID_AAC_LATM,
    ID_QDMC,
    ID_CELT,
    ID_G723_1,
    ID_G729,
    ID_8SVX_EXP,
    ID_8SVX_FIB,
    ID_BMV_AUDIO,
    ID_RALF,
    ID_IAC,
    ID_ILBC,
    ID_OPUS_DEPRECATED,
    ID_COMFORT_NOISE,
    ID_TAK_DEPRECATED,
    ID_FFWAVESYNTH(VideoJNI.Codec_ID_FFWAVESYNTH_get()),
    ID_8SVX_RAW(VideoJNI.Codec_ID_8SVX_RAW_get()),
    ID_SONIC(VideoJNI.Codec_ID_SONIC_get()),
    ID_SONIC_LS(VideoJNI.Codec_ID_SONIC_LS_get()),
    ID_PAF_AUDIO(VideoJNI.Codec_ID_PAF_AUDIO_get()),
    ID_OPUS(VideoJNI.Codec_ID_OPUS_get()),
    ID_TAK(VideoJNI.Codec_ID_TAK_get()),
    ID_EVRC(VideoJNI.Codec_ID_EVRC_get()),
    ID_SMV(VideoJNI.Codec_ID_SMV_get()),
    ID_FIRST_SUBTITLE(VideoJNI.Codec_ID_FIRST_SUBTITLE_get()),
    ID_DVD_SUBTITLE(VideoJNI.Codec_ID_DVD_SUBTITLE_get()),
    ID_DVB_SUBTITLE,
    ID_TEXT,
    ID_XSUB,
    ID_SSA,
    ID_MOV_TEXT,
    ID_HDMV_PGS_SUBTITLE,
    ID_DVB_TELETEXT,
    ID_SRT,
    ID_MICRODVD(VideoJNI.Codec_ID_MICRODVD_get()),
    ID_EIA_608(VideoJNI.Codec_ID_EIA_608_get()),
    ID_JACOSUB(VideoJNI.Codec_ID_JACOSUB_get()),
    ID_SAMI(VideoJNI.Codec_ID_SAMI_get()),
    ID_REALTEXT(VideoJNI.Codec_ID_REALTEXT_get()),
    ID_SUBVIEWER1(VideoJNI.Codec_ID_SUBVIEWER1_get()),
    ID_SUBVIEWER(VideoJNI.Codec_ID_SUBVIEWER_get()),
    ID_SUBRIP(VideoJNI.Codec_ID_SUBRIP_get()),
    ID_WEBVTT(VideoJNI.Codec_ID_WEBVTT_get()),
    ID_MPL2(VideoJNI.Codec_ID_MPL2_get()),
    ID_VPLAYER(VideoJNI.Codec_ID_VPLAYER_get()),
    ID_PJS(VideoJNI.Codec_ID_PJS_get()),
    ID_FIRST_UNKNOWN(VideoJNI.Codec_ID_FIRST_UNKNOWN_get()),
    ID_TTF(VideoJNI.Codec_ID_TTF_get()),
    ID_BINTEXT(VideoJNI.Codec_ID_BINTEXT_get()),
    ID_XBIN(VideoJNI.Codec_ID_XBIN_get()),
    ID_IDF(VideoJNI.Codec_ID_IDF_get()),
    ID_OTF(VideoJNI.Codec_ID_OTF_get()),
    ID_SMPTE_KLV(VideoJNI.Codec_ID_SMPTE_KLV_get()),
    ID_PROBE(VideoJNI.Codec_ID_PROBE_get()),
    ID_MPEG2TS(VideoJNI.Codec_ID_MPEG2TS_get()),
    ID_MPEG4SYSTEMS(VideoJNI.Codec_ID_MPEG4SYSTEMS_get()),
    ID_FFMETADATA(VideoJNI.Codec_ID_FFMETADATA_get());

    public final int swigValue() {
      return swigValue;
    }

    public static Id swigToEnum(int swigValue) {
      Id[] swigValues = Id.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Id swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Id.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Id() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Id(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Id(Id swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum CodecCapability {
  /**
   * Capabilities supported by a codec.
   * Decoder can use draw_horiz_band callback.
   */
    CAP_DRAW_HORIZ_BAND(VideoJNI.Codec_CAP_DRAW_HORIZ_BAND_get()),
  /**
   * Codec uses get_buffer() for allocating buffers and supports custom 
   * allocators.
   * If not set, it might not use get_buffer() at all or use operations 
   * that
   * assume the buffer was allocated by avcodec_default_get_buffer.
   */
    CAP_DR1(VideoJNI.Codec_CAP_DR1_get()),
    CAP_TRUNCATED(VideoJNI.Codec_CAP_TRUNCATED_get()),
    CAP_HWACCEL(VideoJNI.Codec_CAP_HWACCEL_get()),
  /**
   * Encoder or decoder requires flushing with NULL input at the end in 
   * order to
   * give the complete and correct output.
   * NOTE: If this flag is not set, the codec is guaranteed to never be 
   * fed with
   * with NULL data. The user can still send NULL data to the public encode 
   *
   * or decode function, but libavcodec will not pass it along to the 
   * codec
   * unless this flag is set.
   * Decoders:
   * The decoder has a non-zero delay and needs to be fed with avpkt->data=NULL, 
   *
   * avpkt->size=0 at the end to get the delayed data until the decoder 
   * no longer
   * returns frames.
   * Encoders:
   * The encoder needs to be fed with NULL data at the end of encoding 
   * until the
   * encoder no longer returns data.
   * NOTE: Setting this
   * flag also means that the encoder must set the pts and duration for 
   *
   * each output packet. If this flag is not set, the pts and duration 
   * will
   * be determined by libavcodec from the input frame.
   */
    CAP_DELAY(VideoJNI.Codec_CAP_DELAY_get()),
  /**
   * Codec can be fed a final frame with a smaller size.
   * This can be used to prevent truncation of the last audio samples. 
   *
   */
    CAP_SMALL_LAST_FRAME(VideoJNI.Codec_CAP_SMALL_LAST_FRAME_get()),
  /**
   * Codec can export data for HW decoding (VDPAU).
   */
    CAP_HWACCEL_VDPAU(VideoJNI.Codec_CAP_HWACCEL_VDPAU_get()),
  /**
   * Codec can output multiple frames per AVPacket
   * Normally demuxers return one frame at a time, demuxers which do not 
   * do
   * are connected to a parser to split what they return into proper frames. 
   *
   * This flag is reserved to the very rare category of codecs which have 
   * a
   * bitstream that cannot be split into frames without timeconsuming 
   *
   * operations like full decoding. Demuxers carring such bitstreams thus 
   *
   * may return multiple frames in a packet. This has many disadvantages 
   * like
   * prohibiting stream copy in many cases thus it should only be considered 
   *
   * as a last resort.
   */
    CAP_SUBFRAMES(VideoJNI.Codec_CAP_SUBFRAMES_get()),
  /**
   * Codec is experimental and is thus avoided in favor of non experimental 
   *
   * encoders
   */
    CAP_EXPERIMENTAL(VideoJNI.Codec_CAP_EXPERIMENTAL_get()),
  /**
   * Codec should fill in channel configuration and samplerate instead 
   * of container
   */
    CAP_CHANNEL_CONF(VideoJNI.Codec_CAP_CHANNEL_CONF_get()),
  /**
   * Codec is able to deal with negative linesizes
   */
    CAP_NEG_LINESIZES(VideoJNI.Codec_CAP_NEG_LINESIZES_get()),
  /**
   * Codec supports frame-level multithreading.
   */
    CAP_FRAME_THREADS(VideoJNI.Codec_CAP_FRAME_THREADS_get()),
  /**
   *
   */
    CAP_SLICE_THREADS(VideoJNI.Codec_CAP_SLICE_THREADS_get()),
  /**
   * Codec supports changed parameters at any point.
   */
    CAP_PARAM_CHANGE(VideoJNI.Codec_CAP_PARAM_CHANGE_get()),
  /**
   * Codec supports avctx->thread_count == 0 (auto).
   */
    CAP_AUTO_THREADS(VideoJNI.Codec_CAP_AUTO_THREADS_get()),
  /**
   * Audio encoder supports receiving a different number of samples in 
   * each call.
   */
    CAP_VARIABLE_FRAME_SIZE(VideoJNI.Codec_CAP_VARIABLE_FRAME_SIZE_get()),
  /**
   * Codec is intra only.
   */
    CAP_INTRA_ONLY(VideoJNI.Codec_CAP_INTRA_ONLY_get()),
  /**
   * Codec is lossless.
   */
    CAP_LOSSLESS(VideoJNI.Codec_CAP_LOSSLESS_get());

    public final int swigValue() {
      return swigValue;
    }

    public static CodecCapability swigToEnum(int swigValue) {
      CodecCapability[] swigValues = CodecCapability.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (CodecCapability swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + CodecCapability.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private CodecCapability() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private CodecCapability(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private CodecCapability(CodecCapability swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
