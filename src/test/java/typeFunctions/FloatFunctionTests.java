/**
 * Copyright 2016 Yurii Rashkovskii
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 */
package typeFunctions;

import graphql.annotations.GraphQLAnnotations;
import graphql.annotations.typeFunctions.DefaultTypeFunction;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static graphql.Scalars.GraphQLFloat;
import static org.testng.Assert.assertEquals;
import static typeFunctions.DefaultTypeFunctionTestHelper.testedDefaultTypeFunction;

public class FloatFunctionTests {

    @BeforeMethod
    public void init() {
        GraphQLAnnotations.getInstance().getTypeRegistry().clear();
    }

    @Test
    public void buildType_floatType_returnsGraphQLFloat() {
        DefaultTypeFunction instance = testedDefaultTypeFunction();
        assertEquals(instance.buildType(float.class, null,null), GraphQLFloat);
        assertEquals(instance.buildType(Float.class, null,null), GraphQLFloat);
        assertEquals(instance.buildType(Double.class, null,null), GraphQLFloat);
        assertEquals(instance.buildType(double.class, null,null), GraphQLFloat);
    }
}