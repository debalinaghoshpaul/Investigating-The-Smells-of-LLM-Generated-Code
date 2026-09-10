Instant inFuture = Instant.now().plusSeconds(1000000);
long secondsSince1970 = inFuture.getEpochSecond();
System.out.println("Seconds since 1970: " + secondsSince1970);
