/*
 * Copyright (c) 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


/*
 * @test
 *
 * @summary converted from VM Testbase nsk/jvmti/scenarios/multienv/MA07/ma07t001.
 * VM Testbase keywords: [quick, jpda, jvmti, noras]
 * VM Testbase readme:
 * DESCRIPTION
 *     This test is for MA07 scenario of "multiple environments support".
 *     VM starts with two different agents with callbacks on ClassFileLoadHook
 *     event are set and enabled in both agents. The test sets newly instrumented
 *     class file data buffers for checked class C in callbacks of both agents.
 *     Let A2's environment was created later than A1's one. The test check:
 *       - if the event is received for class C in both agents;
 *       - if class data instrumented in A1 was passed in to the event's
 *         callback in A2;
 *       - if class version instrumented in A2 is in effect in both agents.
 * COMMENTS
 *
 * @library /vmTestbase
 *          /test/lib
 * @run driver jdk.test.lib.FileInstaller . .
 * @run main/othervm/native
 *      -agentlib:ma07t001=-waittime=5
 *      -agentlib:ma07t001a=-waittime=5
 *      nsk.jvmti.scenarios.multienv.MA07.ma07t001
 */

