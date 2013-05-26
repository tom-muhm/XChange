/**
 * Copyright (C) 2012 - 2013 Xeiam LLC http://xeiam.com
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.mtgox.v1.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;

/**
 * Data object representing a response message from Mt Gox after placing and order
 * 
 * @deprecated Use V2! This will be removed in 1.8.0+
 */
@Deprecated
public final class MtGoxGenericResponse {

  private final String result;
  private final Object _return;
  private final String error;

  /**
   * Constructor
   * 
   * @param result
   * @param _return
   * @param error
   */
  public MtGoxGenericResponse(@JsonProperty("result") String result, @JsonProperty("return") Object _return, @JsonProperty("error") String error) {

    this.result = result;
    this._return = _return;
    this.error = error;
  }

  public String getResult() {

    return result;
  }

  @JsonRawValue
  public Object getReturn() {

    return _return;
  }

  public String getReturnString() {

    return _return == null ? null : _return.toString();
  }

  public String getError() {

    return error;
  }

  @Override
  public String toString() {

    return "MtGoxGenericResponse [result=" + result + ", _return=" + _return + ", error=" + error + "]";
  }

}
