/*
 * Copyright 2014 JBoss Inc
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
package io.apiman.manager.ui.client.local.services;

/**
 * Keys to use when using the {@link CurrentContextService}.
 *
 * @author eric.wittmann@redhat.com
 */
public final class ContextKeys {
    
    public static final String CURRENT_ORGANIZATION = "organizations.current"; //$NON-NLS-1$
    public static final String CURRENT_APPLICATION = "applications.current"; //$NON-NLS-1$
    public static final String CURRENT_APPLICATION_VERSION = "applications.current-version"; //$NON-NLS-1$
    public static final String CURRENT_PLAN = "plans.current"; //$NON-NLS-1$
    public static final String CURRENT_PLAN_VERSION = "plans.current-version"; //$NON-NLS-1$
    public static final String CURRENT_SERVICE = "services.current"; //$NON-NLS-1$
    public static final String CURRENT_SERVICE_VERSION = "services.current-version"; //$NON-NLS-1$

}
