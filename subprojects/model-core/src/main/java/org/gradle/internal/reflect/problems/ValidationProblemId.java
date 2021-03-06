/*
 * Copyright 2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.internal.reflect.problems;

public enum ValidationProblemId {
    // This enum value should go away as soon as possible!
    UNCLASSIFIED_PROBLEM,

    // Now every time you add a new validation problem, you need
    // to assign it an id, so that it can be referenced in tests
    INVALID_USE_OF_CACHEABLE_TRANSFORM_ANNOTATION,
    MISSING_NORMALIZATION_ANNOTATION,
    VALUE_NOT_SET,
    CACHEABLE_TRANSFORM_CANT_USE_ABSOLUTE_SENSITIVITY,
    ARTIFACT_TRANSFORM_SHOULD_NOT_DECLARE_OUTPUT,
}
