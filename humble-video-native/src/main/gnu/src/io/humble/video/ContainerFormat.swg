/*
 * Copyright (c) 2013-Forward, Andrew "Art" Clarke
 *
 * This file is part of Humble Video.
 * 
 * Humble Video is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Humble Video is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with Humble Video.  If not, see <http://www.gnu.org/licenses/>.
 *
 *  Created on: Jun 28, 2013
 *      Author: aclarke
 */
// Make some methods actually protected
%javamethodmodifiers getNumSupportedCodecs "protected";
%javamethodmodifiers getSupportedCodecId "protected";
%javamethodmodifiers getSupportedCodecTag "protected";

%typemap (javacode) io::humble::video::ContainerFormat,io::humble::video::ContainerFormat*,io::humble::video::ContainerFormat& %{

  /**
    * info about this format object
    * @return information about this object
    */
    
   @Override
   public String toString()
   {
     StringBuilder result = new StringBuilder();
     
     result.append(this.getClass().getName()+"@"+hashCode()+"[");
     result.append("name:"+getName()+";");
     result.append("longname:"+getName()+";");
     result.append("extensions:"+getExtensions()+";");
     result.append("flags:"+getFlags()+";");
     result.append("]");
     return result.toString();
   }
   /**
    * Returns a list of all codecs supported for this Object.
    *
    * <p>
    *
    * If this object hasn't been set up for output, then
    * we return null.
    *
    * </p>
    *
    * @return A list of supported codecs, in decreasing preferred order.
    */
   public java.util.Collection<Codec.ID> getSupportedCodecs()
   {
     final java.util.List<Codec.ID> retval =
       new java.util.LinkedList<Codec.ID>();
     final java.util.Set<Codec.ID> uniqueSet =
       new java.util.HashSet<Codec.ID>();
     
     int numCodecs = getNumSupportedCodecs();
     for(int i = 0; i < numCodecs; i++)
     {
       Codec.ID id = getSupportedCodecId(i);
       // remove duplicate IDs
       if (id != Codec.ID.CODEC_ID_NONE && !uniqueSet.contains(id))
         retval.add(id);
       uniqueSet.add(id);
     }    
     return retval;
   }

   /**
    * Returns a list of all codec tags supported for this container.
    *
    * <p>
    *
    * If this object hasn't been set up for output, then
    * we return null.
    *
    * </p>
    *
    * @return A list of supported codec tags, in decreasing preferred order.
    */
   public java.util.Collection<Long> getSupportedTags()
   {
     final java.util.List<Long> retval =
       new java.util.LinkedList<Long>();
     final java.util.Set<Long> uniqueSet =
       new java.util.HashSet<Long>();
     
     int numCodecs = getNumSupportedCodecs();
     for(int i = 0; i < numCodecs; i++)
     {
       long tag = getSupportedCodecTag(i);
       Codec.ID id = getSupportedCodecId(i);
       // remove duplicate tags
       if (id != Codec.ID.CODEC_ID_NONE && !uniqueSet.contains(tag))
         retval.add(tag);
       uniqueSet.add(tag);
     }    
     return retval;
   }

%}

%include <io/humble/video/ContainerFormat.h>
