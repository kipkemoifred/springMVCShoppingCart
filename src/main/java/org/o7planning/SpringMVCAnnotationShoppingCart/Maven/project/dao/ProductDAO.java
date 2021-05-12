package org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.dao;
import org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.entity.Product;
import org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.model.PaginationResult;
import org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.model.ProductInfo;
import org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.entity.Product;
import org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.model.PaginationResult;
import org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.model.ProductInfo;

public interface ProductDAO {



    public Product findProduct(String code);

    public ProductInfo findProductInfo(String code) ;


    public PaginationResult<ProductInfo> queryProducts(int page,
                                                       int maxResult, int maxNavigationPage  );

    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                                                       int maxNavigationPage, String likeName);

    public void save(ProductInfo productInfo);

}
