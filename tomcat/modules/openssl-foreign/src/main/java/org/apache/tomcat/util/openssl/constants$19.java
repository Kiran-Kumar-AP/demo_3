/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$19 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$19() {}
    static final FunctionDescriptor SSL_shutdown$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SSL_shutdown$MH = RuntimeHelper.downcallHandle(
        "SSL_shutdown",
        constants$19.SSL_shutdown$FUNC
    );
    static final FunctionDescriptor SSL_verify_client_post_handshake$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SSL_verify_client_post_handshake$MH = RuntimeHelper.downcallHandle(
        "SSL_verify_client_post_handshake",
        constants$19.SSL_verify_client_post_handshake$FUNC
    );
    static final FunctionDescriptor SSL_CTX_set_client_CA_list$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SSL_CTX_set_client_CA_list$MH = RuntimeHelper.downcallHandle(
        "SSL_CTX_set_client_CA_list",
        constants$19.SSL_CTX_set_client_CA_list$FUNC
    );
    static final FunctionDescriptor SSL_CTX_get_client_CA_list$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SSL_CTX_get_client_CA_list$MH = RuntimeHelper.downcallHandle(
        "SSL_CTX_get_client_CA_list",
        constants$19.SSL_CTX_get_client_CA_list$FUNC
    );
    static final FunctionDescriptor SSL_CTX_add_client_CA$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SSL_CTX_add_client_CA$MH = RuntimeHelper.downcallHandle(
        "SSL_CTX_add_client_CA",
        constants$19.SSL_CTX_add_client_CA$FUNC
    );
    static final FunctionDescriptor SSL_set_connect_state$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SSL_set_connect_state$MH = RuntimeHelper.downcallHandle(
        "SSL_set_connect_state",
        constants$19.SSL_set_connect_state$FUNC
    );
}


