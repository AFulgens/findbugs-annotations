package edu.umd.cs.findbugs.annotations;
/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*  http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Used to annotate a method that, if overridden, must (or should) be invoked by an invocation on super in the
 * overriding method. Examples of such methods include finalize() and clone(). The argument to the method indicates
 * when the super invocation should occur: at any time, at the beginning of the overriding method,
 * or at the end of the overriding method.
 *
 * @deprecated use {@link javax.annotation.OverridingMethodsMustInvokeSuport} instead
 */
@Documented
@Target(value = METHOD)
@Retention(value = CLASS)
@Deprecated
public @interface OverrideMustInvoke {

    When value() default When.ANYTIME;
    
}
