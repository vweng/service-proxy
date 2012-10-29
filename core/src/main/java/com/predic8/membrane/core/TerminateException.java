/* Copyright 2009 predic8 GmbH, www.predic8.com

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License. */

package com.predic8.membrane.core;


public class TerminateException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6330549161301272316L;

	/**
	 * 
	 */
	public TerminateException() {
		super();
	}

	/**
	 * @param message
	 */
	public TerminateException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public TerminateException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public TerminateException(String message, Throwable cause) {
		super(message, cause);
	}

}