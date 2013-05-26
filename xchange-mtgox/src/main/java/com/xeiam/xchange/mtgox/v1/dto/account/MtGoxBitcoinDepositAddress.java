/**
 * Copyright (C) 2012 - 2013 Mark van Cuijk mark@van-cuijk.nl
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
package com.xeiam.xchange.mtgox.v1.dto.account;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data object representing the content of a response message from MtGox after requesting a bitcoin deposit address
 * 
 * @deprecated Use V2! This will be removed in 1.8.0+
 */
@Deprecated
public final class MtGoxBitcoinDepositAddress {

  private final String address;

  /**
   * Constructor
   * 
   * @param address
   */
  public MtGoxBitcoinDepositAddress(@JsonProperty("addr") String address) {

    this.address = address;
  }

  public String getAddres() {

    return address;
  }

  @Override
  public String toString() {

    return "MtGoxBitcoinDepositAddress [address=" + address + "]";
  }

}