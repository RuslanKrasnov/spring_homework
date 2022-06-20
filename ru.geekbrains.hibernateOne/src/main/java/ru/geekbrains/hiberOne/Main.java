package ru.geekbrains.hiberOne;

public class Main {

    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
            try {
                ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);
                System.out.println(productDao.findAll());
                Product beer = new Product("beer", 90);
                productDao.saveOrUpdate(beer);
                Product apple = new Product("Apple", 299);
                apple.setId(3L);
                productDao.saveOrUpdate(apple);
                System.out.println(productDao.findAll());
            } catch (Exception e){
                e.printStackTrace();
            } finally {
                sessionFactoryUtils.shutdown();
            }
    }
}
