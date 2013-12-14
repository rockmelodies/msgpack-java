//
// MessagePack for Java
//
//    Licensed under the Apache License, Version 2.0 (the "License");
//    you may not use this file except in compliance with the License.
//    You may obtain a copy of the License at
//
//        http://www.apache.org/licenses/LICENSE-2.0
//
//    Unless required by applicable law or agreed to in writing, software
//    distributed under the License is distributed on an "AS IS" BASIS,
//    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//    See the License for the specific language governing permissions and
//    limitations under the License.
//
package org.msgpack.unpacker;

import java.io.IOException;

public class MessageUnpackerException extends IOException {
    public MessageUnpackerException() {
        super();
    }

    public MessageUnpackerException(String message) {
        super(message);
    }

    public MessageUnpackerException(String message, Throwable cause) {
        super(message, cause);
    }

    public MessageUnpackerException(Throwable cause) {
        super(cause);
    }
}