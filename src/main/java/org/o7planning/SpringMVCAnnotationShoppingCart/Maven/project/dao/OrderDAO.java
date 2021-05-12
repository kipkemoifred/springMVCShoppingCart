package org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.dao;

import java.util.List;

import org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.model.OrderDetailInfo;
import org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.model.OrderInfo;
import org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.model.PaginationResult;
import org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.model.CartInfo;
import org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.model.OrderDetailInfo;
import org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.model.OrderInfo;
import org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.model.PaginationResult;

public interface OrderDAO {

    public void saveOrder(CartInfo cartInfo);

    public PaginationResult<OrderInfo> listOrderInfo(int page,
                                                     int maxResult, int maxNavigationPage);

    public OrderInfo getOrderInfo(String orderId);

    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}
