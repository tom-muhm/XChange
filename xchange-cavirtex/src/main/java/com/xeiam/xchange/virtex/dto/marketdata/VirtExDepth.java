/**
 * Copyright (C) 2012 Xeiam LLC http://xeiam.com
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
package com.xeiam.xchange.virtex.dto.marketdata;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Data object representing depth from VirtEx
 * 
 * @immutable
 */
public final class VirtExDepth {

  private final List<float[]> asks;
  private final List<float[]> bids;

  /**
   * Constructor
   * 
   * @param asks
   * @param bids
   */
  public VirtExDepth(@JsonProperty("asks") List<float[]> asks, @JsonProperty("bids") List<float[]> bids) {

    this.asks = asks;
    this.bids = bids;
  }

  public List<float[]> getAsks() {

    return asks;
  }

  public List<float[]> getBids() {

    return bids;
  }

  @Override
  public String toString() {

    return "VirtExDepth [asks=" + asks.toString() + ", bids=" + bids.toString() + "]";
  }

}