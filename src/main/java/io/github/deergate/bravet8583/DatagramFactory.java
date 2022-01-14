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
 * 报文工厂
 *
 * @author Shang Yehua <niceshang@outlook.com>
 * @since 2022-01-14  09:02
 *
 */
public interface DatagramFactory {
    
    Datagram from8583(byte[] data);
    
    Datagram create8583Reverse(byte[] data);
    
    Datagram fromJson(String json);
    
    Datagram createHeartBeat();
    
    Datagram createHeartBeatResponse(Datagram heartBeat);
    
    Datagram createTest();
    
    Datagram createLogin();
    
    Datagram createLogout();
    
    Datagram createDatagram(String mti);
    
    Datagram createDatagram(byte[] header);
    
    Datagram createDatagram(byte[] header,String mti);
}
