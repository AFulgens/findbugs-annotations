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

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Annotation indicating that <i>no</i> FindBugs warning is expected.
 */
@Retention(value = CLASS)
public @interface NoWarning {
    
    /**
     * The value indicates the bug code (e.g., NP) or bug pattern (e.g., IL_INFINITE_LOOP) 
     * that should not be reported.
     */
    String value();

    /**
     * Want no warning at this priority or higher
     */
    Confidence confidence() default Confidence.LOW;

    /**
     * Expect no warning at this rank or scarier
     */
    int rank() default 20;

    /**
     * Tolerate up to this many warnings
     */
    int num() default 0;
    
}
