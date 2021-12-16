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
package io.github.deergate.eat8583.except;

import java.io.IOException;

/**
 *
 * IO通用异常
 *
 * @author Shang Yehua <niceshang@outlook.com>
 * @since 2021-12-16  17:32
 *
 */
public class EatIoException extends IOException {
    private final static long serialVersionUID = 0731; // ide complains otherwise
    
     /**
     * Constructs an {@code EatIoException} with {@code null}
     * as its error detail message.
     */
    public EatIoException() {
        super();
    }

    /**
     * Constructs an {@code EatIoException} with the specified detail message.
     *
     * @param message
     *        The detail message (which is saved for later retrieval
     *        by the {@link #getMessage()} method)
     */
    public EatIoException(String message) {
        super(message);
    }

    /**
     * Constructs an {@code EatIoException} with the specified detail message
     * and cause.
     *
     * <p> Note that the detail message associated with {@code cause} is
     * <i>not</i> automatically incorporated into this exception's detail
     * message.
     *
     * @param message
     *        The detail message (which is saved for later retrieval
     *        by the {@link #getMessage()} method)
     *
     * @param cause
     *        The cause (which is saved for later retrieval by the
     *        {@link #getCause()} method).  (A null value is permitted,
     *        and indicates that the cause is nonexistent or unknown.)
     *
     * @since 1.6
     */
    public EatIoException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs an {@code EatIoException} with the specified cause and a
     * detail message of {@code (cause==null ? null : cause.toString())}
     * (which typically contains the class and detail message of {@code cause}).
     * This constructor is useful for IO exceptions that are little more
     * than wrappers for other throwables.
     *
     * @param cause
     *        The cause (which is saved for later retrieval by the
     *        {@link #getCause()} method).  (A null value is permitted,
     *        and indicates that the cause is nonexistent or unknown.)
     *
     * @since 1.6
     */
    public EatIoException(Throwable cause) {
        super(cause);
    }
}
