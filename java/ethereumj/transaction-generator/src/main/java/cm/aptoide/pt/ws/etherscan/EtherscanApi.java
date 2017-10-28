package cm.aptoide.pt.ws.etherscan;

import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

public interface EtherscanApi {

	@GET("api?module=account&action=tokenbalance&tag=latest")
	Observable<BalanceResponse> getTokenBalance(@Query("contractaddress") String
																													 contractaddress, @Query("address")
					String address);

	@GET("api?module=account&action=balance&tag=latest")
	Observable<BalanceResponse> getBalance(@Query("address") String address);

	@POST("api?module=proxy&action=eth_sendRawTransaction")
	Observable<Object> sendRawTransaction(@Query("hex") String rawData);
}