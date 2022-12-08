/**
 * IST-311 Object Oriented Design and Software Application
 * Prof. Jesse Middaugh
 * Project
 * Team-2
 */

package Controllers;

import Model.Commodity;
import Model.Stock;

public class RESTServiceHandler
{
  private String apiKey;
  private String apiUrl;
  
  public RESTServiceHandler(String apiKey, String apiUrl)
  {
    this.apiKey = apiKey;
    this.apiUrl = apiUrl;
  }
  
  public Commodity getCommodityData(String scrip)
  {
    return new Stock();
  }
}
