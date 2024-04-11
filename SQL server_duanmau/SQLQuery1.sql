CREATE DATABASE PTPM_FINALLY_JAVA_SOF20412;
GO
USE PTPM_FINALLY_JAVA_SOF20412;
GO

CREATE TABLE NhanVien (
    MaNV INT PRIMARY KEY,
    MatKhau NVARCHAR(50),
    HoTen NVARCHAR(100),
    VaiTro NVARCHAR(50)
);
CREATE TABLE ChuyenDe (
    MaCD INT PRIMARY KEY,
    TenCD NVARCHAR(100),
    HocPhi FLOAT,
    ThoiLuong INT,
    Hinh NVARCHAR(MAX),
    MoTa NVARCHAR(MAX)
);
CREATE TABLE KhoaHoc (
    MaKH INT PRIMARY KEY,
    MaCD INT,
    HocPhi FLOAT,
    ThoiLuong INT,
    NgayKG DATE,
    GhiChu NVARCHAR(MAX),
    MaNV INT,
    NgayTao DATETIME DEFAULT GETDATE()
);

CREATE TABLE NguoiHoc (
    MaNH INT PRIMARY KEY,
    HoTen NVARCHAR(100),
    NgaySinh DATE,
    DienThoai NVARCHAR(20),
    Email NVARCHAR(50),
    GhiChu NVARCHAR(MAX),
    MaNV INT,
    NgayDK DATETIME DEFAULT GETDATE()
);

CREATE TABLE HocVien (
    MaHV INT PRIMARY KEY,
    MaKH INT,
    MaNH INT,
    Diem FLOAT
);

ALTER TABLE KhoaHoc
ADD CONSTRAINT FK_KhoaHoc_ChuyenDe
FOREIGN KEY (MaCD) REFERENCES ChuyenDe(MaCD);

ALTER TABLE KhoaHoc
ADD CONSTRAINT FK_KhoaHoc_NhanVien
FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV);

ALTER TABLE NguoiHoc
ADD CONSTRAINT FK_NguoiHoc_NhanVien
FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV);

ALTER TABLE HocVien
ADD CONSTRAINT FK_HocVien_KhoaHoc
FOREIGN KEY (MaKH) REFERENCES KhoaHoc(MaKH);

ALTER TABLE HocVien
ADD CONSTRAINT FK_HocVien_NguoiHoc
FOREIGN KEY (MaNH) REFERENCES NguoiHoc(MaNH);

-- INSERT Dữ liệu:
INSERT INTO NhanVien (MaNV, MatKhau, HoTen, VaiTro)
VALUES (1, 'matkhau1', 'Ho Ten 1', 'VaiTro1'),
       (2, 'matkhau2', 'Ho Ten 2', 'VaiTro2'),
       (3, 'matkhau3', 'Ho Ten 3', 'VaiTro3'),
       (4, 'matkhau4', 'Ho Ten 4', 'VaiTro4'),
       (5, 'matkhau5', 'Ho Ten 5', 'VaiTro5');

INSERT INTO ChuyenDe (MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa)
VALUES (1, 'Chuyen De 1', 1000000, 24, 'hinh1.jpg', 'Mo ta cho Chuyen De 1'),
       (2, 'Chuyen De 2', 1200000, 36, 'hinh2.jpg', 'Mo ta cho Chuyen De 2'),
       (3, 'Chuyen De 3', 800000, 20, 'hinh3.jpg', 'Mo ta cho Chuyen De 3'),
       (4, 'Chuyen De 4', 1500000, 30, 'hinh4.jpg', 'Mo ta cho Chuyen De 4'),
       (5, 'Chuyen De 5', 900000, 18, 'hinh5.jpg', 'Mo ta cho Chuyen De 5');

INSERT INTO KhoaHoc (MaKH, MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV, NgayTao)
VALUES (1, 1, 1000000, 24, '2023-09-20', 'Ghi chu cho khoa hoc 1', 1, GETDATE()),
       (2, 2, 1200000, 36, '2023-09-22', 'Ghi chu cho khoa hoc 2', 2, GETDATE()),
       (3, 3, 800000, 20, '2023-09-25', 'Ghi chu cho khoa hoc 3', 3, GETDATE()),
       (4, 4, 1500000, 30, '2023-09-28', 'Ghi chu cho khoa hoc 4', 4, GETDATE()),
       (5, 5, 900000, 18, '2023-09-30', 'Ghi chu cho khoa hoc 5', 5, GETDATE());

INSERT INTO NguoiHoc (MaNH, HoTen, NgaySinh, DienThoai, Email, GhiChu, MaNV, NgayDK)
VALUES (1, 'Nguyen Van A', '1990-01-15', '123456789', 'nguyenvana@gmail.com', 'Ghi chu cho nguoi hoc 1', 1, GETDATE()),
       (2, 'Nguyen Van B', '1992-05-20', '987654321', 'nguyenvanb@gmail.com', 'Ghi chu cho nguoi hoc 2', 2, GETDATE());
