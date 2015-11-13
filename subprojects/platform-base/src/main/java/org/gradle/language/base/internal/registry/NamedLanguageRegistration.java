/*
 * Copyright 2013 the original author or authors.
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

package org.gradle.language.base.internal.registry;

import org.gradle.language.base.LanguageSourceSet;
import org.gradle.model.internal.type.ModelType;

public class NamedLanguageRegistration<T extends LanguageSourceSet> implements LanguageRegistration<T> {

    private final String name;
    private final ModelType<T> sourceSetType;
    private final ModelType<? extends T> sourceSetImplementation;

    public NamedLanguageRegistration(String name, Class<T> sourceSetType, Class<? extends T> sourceSetImplementation) {
        this.name = name;
        this.sourceSetType = ModelType.of(sourceSetType);
        this.sourceSetImplementation = ModelType.of(sourceSetImplementation);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ModelType<T> getSourceSetType() {
        return sourceSetType;
    }

    @Override
    public ModelType<? extends T> getSourceSetImplementationType() {
        return sourceSetImplementation;
    }

}
