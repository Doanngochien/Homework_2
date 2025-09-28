--Thêm 1 khách hàng mới vào bảng customers
Insert into dbo.Customers(CustomerID,Name,City,Email)
Values (21,'phuong hoa','nghe an','phuonghoa@gmail.com');

--Thêm 1 sản phẩm mới vào bảng products
Insert into dbo.Products(ProductID,ProductName,Price,Category)
values ( 13,'ban phim co', 5.2,'logi');

--Thêm đơn hàng ID = 1021 do khách hàng có ID = 1 đặt ngày 2025-07-28
Insert into dbo.Orders(OrderID,CustomerID,OrderDate)
values (1021, 1, '2025-07-28');

--Thêm chi tiết đơn hàng cho đơn hàng có ID = 1021 gồm 2 sản phẩm có ID = 1
Insert into dbo.OrderDetail(OrderDetailID,OrderID,ProductID,Quantity)
values (2,1021,1,2);

--Cập nhật giá của sản phẩm "Laptop" thành 1500
Update dbo.Products
set price = 1500
where ProductName='Laptop';

--Xóa đơn hàng và chi tiết đơn hàng của người dùng có ID = 1
Alter table orders
add isDeleted bit default 0;

alter table orderdetail 
add isDeleted bit default 0;

update orders
set isDeleted = 1
where customerid=1;

update orderdetail
set isDeleted = 1
where orderid in (select orderid from orders where isDeleted = 1);

-- Hiển thị danh sách đơn hàng, bao gồm:​Mã đơn hàng,Ngày đặt hàng,Tên khách hàng​
select orderid, orderdate, name
from orders o
left join customers c
on o.CustomerID= c.CustomerID;

--Hiển thị chi tiết từng đơn hàng, bao gồm:​Mã đơn hàng,Tên sản phẩm​,Số lượng đặt​,Đơn giá​
select orderid, productname, quantity,price
from orderdetail od
left join Products p
on od.productid = p.ProductID;

--Tính tổng số lượng sản phẩm được đặt cho từng đơn hàng.​Hiển thị: Mã đơn hàng, tổng số lượng sản phẩm.
select orderid, sum(quantity)as total
from orderdetail 
group by orderid;
--Tính tổng tiền của mỗi đơn hàng.​Tổng tiền = Số lượng × Giá​.Hiển thị: Mã đơn hàng, tổng tiền.
select orderid, sum( od.quantity * p.price)as totalmoney
from orderdetail od
join products p
on od.productid = p.productid
group by orderid

--Tìm khách hàng có tổng giá trị đơn hàng cao nhất
select top 1 c.CustomerID,sum(od.quantity*p.price)as totalvalue
from orderdetail od
join products p
on od.ProductID = p.ProductID
join orders o
on o.OrderID=od.OrderID
join  customers c
on c.CustomerID = o.CustomerID
group by c.CustomerID
order by totalvalue DESC;

















