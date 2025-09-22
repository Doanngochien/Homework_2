--Hiển thị danh sách tên khách hàng (name) và email.
SELECT Name, Email
FROM Customers;
--Tìm khách hàng sống tại thành phố Hanoi hoặc Hue.
SELECT *
FROM Customers
WHERE City IN (N'Hanoi', N'Hue');
--Liệt kê khách hàng có tên bắt đầu bằng chữ C kết thúc bằng chữ E
SELECT *
FROM Customers
WHERE Name LIKE N'C%E';
--Hiển thị danh sách 5 khách hàng đầu tiên sau khi sắp xếp theo name tăng dần.
SELECT TOP 5 *
FROM Customers
ORDER BY Name ASC;
--Hiển thị 10 sản phẩm có giá cao nhất.
SELECT TOP 10 *
FROM Products
ORDER BY Price DESC;
--Đếm số sản phẩm có giá lớn hơn 500
SELECT COUNT(*) AS SoSanPham
FROM Products
WHERE Price > 500;
--Tính trung bình giá các sản phẩm mà tên có phân loại là Electronics
SELECT AVG(Price) AS GiaTrungBinh
FROM Products
WHERE Category = N'Electronics';
--Lấy ra đơn hàng mới nhất
SELECT TOP 1 *
FROM Orders
ORDER BY OrderDate DESC;
