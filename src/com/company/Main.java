package com.company;


import com.company.Adapter.PriceAdapter;
import com.company.Adapter.IPriceAdapter;
import com.company.Bridge.Blue;
import com.company.Decorator.Leather;
import com.company.Factory.Tissot;
import com.company.Factory.TissotFactory;
import com.company.Factory.Watch;
import com.company.Factory.WatchFactory;
import com.company.Observer.Client;
import com.company.Observer.Shop;
import com.company.Strategy.MasterCard;
import com.company.Strategy.VISA;

public class  Main {
    public static void main(String[] args) {

        WatchFactory carFactory = new TissotFactory ();
        Watch watch = carFactory.build ();
        System.out.println ( "Watch was built." );
        System.out.println ( "Price:" );
        System.out.println ( watch.getPrice () );

        IPriceAdapter priceAdapter = new PriceAdapter ( watch );
        System.out.println ( "Converting price..." );
        System.out.println ( priceAdapter.getPrice () + " $" );

        watch = new Leather ( new Tissot () );
        System.out.println ( watch.getPrice () );


        watch = new Tissot ( new Blue () );
        System.out.println ( watch.toColor () );


        Shop shop = new Shop ();

        Client client1 = new Client ( "Ali" );
        Client client2 = new Client ( "Nur" );

        client1.setPayStrategy ( new MasterCard () );
        client2.setPayStrategy ( new VISA () );

        shop.add ( client1 );
        shop.add ( client2 );


    }
}
