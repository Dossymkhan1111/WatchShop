

## **_Watch Shop_**

---


We use six types of design pattern, also connecting with each other. 
We take for example a small online watch store that can customize watches to a lot of various type of color



```WatchFactory carFactory = new TissotFactory ();
Watch watch = carFactory.build ();
System.out.println ( "Watch was built." );
System.out.println ( "Price:" );
System.out.println ( watch.getPrice () );`

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
        shop.add ( client2 );``
        
        
        


We use converter of price to dollars and create objects of classes, using _Observer_ pattern, client subscribe to our channel and will have been notified for news





