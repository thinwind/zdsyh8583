/* 
 * Copyright 2021 Shang Yehua <niceshang@outlook.com>
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
package io.github.deergate.eat8583.core;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * TODO FieldType说明
 *
 * @author Shang Yehua <niceshang@outlook.com>
 * @since 2021-12-17  09:47
 *
 */
public enum FieldType {
    @JsonProperty("b")
    BIT,
    @JsonProperty("cn")
    CN,
    
}
