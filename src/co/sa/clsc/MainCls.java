package co.sa.clsc;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MainCls {
	//Use these when you are dealing with answers which may not be immediate
	public static void main(String[] args) {
		CompletableFuture<String> myFuture=CompletableFuture.supplyAsync(()->"Hai there iam completable future");
		CompletableFuture<String> bFuture=CompletableFuture.supplyAsync(()->"Hai there iam completable future B");
		try {
			System.out.println(myFuture.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}	
		CompletableFuture<String> combFuture=myFuture.thenCombine(bFuture, (m1,m2)->m1+" "+m2);
		try {
			System.out.println(combFuture.get());
			CompletableFuture<Integer> iFuture=CompletableFuture.supplyAsync(()->10/0).exceptionally(ex->0);
			System.out.println(iFuture.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}	
	}
}
