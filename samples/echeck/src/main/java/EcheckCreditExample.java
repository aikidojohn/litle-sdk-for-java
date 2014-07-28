package com.litle.sdk.samples;
import com.litle.sdk.*;
import com.litle.sdk.generate.*;
 
public class EcheckCreditExample {
    public static void main(String[] args) {
	EcheckCredit echeckcredit = new EcheckCredit();
        //LitleTxnId from an earlier echeck sale
	echeckcredit.setLitleTxnId(123456789101112L);
 
        EcheckCreditResponse response = new LitleOnline().echeckCredit(echeckcredit);
        //Display Results
        System.out.println("Response: " + response.getResponse());
        System.out.println("Message: " + response.getMessage());
        System.out.println("Litle Transaction ID: " + response.getLitleTxnId());
    }
}
