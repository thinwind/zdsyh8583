/* 
 * Copyright 2022 Shang Yehua <niceshang@outlook.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.deergate.bravet8583;

/**
 *
 * 报文对象，提供报文操作支持
 *
 * @author Shang Yehua <niceshang@outlook.com>
 * @since 2022-01-14  08:37
 *
 */
public interface Datagram {
    
    byte[] get8583MacSource();
    
    byte[] getJsonMacSource();
    
    String getMAC();
    
    byte[] getPIN();
    
    byte[] to8583();
    
    String toJson();
    
    String getMti();
    
    byte[] getHeader();
    
    String getHeaderInHex();
    
    String getHeaderInStr();
    
    byte[] getField(int index);
    
    String getFieldInHex(int index);
    
    String getFieldInStr(int index);
    
    Datagram setMAC(byte[] mac);
    
    Datagram setMAC(String mac);
    
    Datagram setPIN(byte[] pin);
    
    Datagram setHeader(byte[] header);
    
    Datagram setHeaderInHex(String header);
    
    Datagram addOrReplaceField(int index,byte[] field);
    
    Datagram addOrReplaceFieldInHex(int index,byte[] field);
    
    Datagram removeField(int index);
}
