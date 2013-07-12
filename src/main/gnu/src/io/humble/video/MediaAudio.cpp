/*******************************************************************************
 * Copyright (c) 2013, Art Clarke.  All rights reserved.
 *  
 * This file is part of Humble-Video.
 *
 * Humble-Video is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Humble-Video is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Humble-Video.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
/*
 * Audio.cpp
 *
 *  Created on: Jul 10, 2013
 *      Author: aclarke
 */

#include "MediaAudio.h"
#include "MediaAudioImpl.h"

namespace io {
namespace humble {
namespace video {

MediaAudio::MediaAudio() {

}

MediaAudio::~MediaAudio() {

}

MediaAudio*
MediaAudio::make(int32_t numSamples, int32_t sampleRate,
    int32_t channels, AudioChannel::Layout channelLayout,
    AudioFormat::Type format) {
  return MediaAudioImpl::make(numSamples, sampleRate, channels, channelLayout, format);
}

MediaAudio*
MediaAudio::make(io::humble::ferry::IBuffer *buffer, int32_t numSamples,
    int32_t sampleRate, int32_t channels,
    AudioChannel::Layout channelLayout, AudioFormat::Type format) {
  return MediaAudioImpl::make(buffer, numSamples, sampleRate, channels, channelLayout, format);
}

} /* namespace video */
} /* namespace humble */
} /* namespace io */
