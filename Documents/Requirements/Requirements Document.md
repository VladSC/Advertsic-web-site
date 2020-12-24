# ���������� � �������
---

# ����������
1 [��������](#intro)  
1.1 [����������](#appointment)  
1.2 [������-����������](#business_requirements)  
1.2.1 [�������� ������](#initial_data)  
1.2.2 [����������� �������](#business_opportunities)  
1.2.3 [������� �������](#project_boundary)  
1.3 [�������](#analogues)  
1.3.1 [�����](#avito)  
1.3.2 [�����](#kufar)  
2 [���������� ������������](#user_requirements)  
2.1 [����������� ����������](#software_interfaces)  
2.2 [��������� ������������](#user_interface)  
2.3 [�������������� �������������](#user_specifications)  
2.3.1 [������ �������������](#user_classes)  
2.3.2 [������� ���������](#target_audience)  
2.4 [������������� � �����������](#assumptions_and_dependencies)  
3 [��������� ����������](#system_requirements)  
3.1 [�������������� ����������](#functional_requirements)  
3.1.1 [�������� �������](#main_functions)  
3.1.1.1 [����������� ������������](#registration)  
3.1.1.2 [����������� ������������������� ������������](#authorization)  
3.1.1.3 [�������� ����������](#view_ads)  
3.1.1.4 [���������� ������ ����������](#adding_new_ad)  
3.1.1.5 [�������� ����� ����������](#view_your_ads)  
3.1.1.6 [�������������� ����������](#edit_ads)  
3.1.1.7 [�������� ����������](#delete_ads)  
3.1.1.8 [����� �� ������� ������](#log_out)  
3.1.2 [����������� � ����������](#restrictions_and_exclusions)  
3.2 [���������������� ����������](#non-functional_requirements)  
3.2.1 [�������� ��������](#quality_attributes)  
3.2.1.1 [���������� � �������� �������������](#requirements_for_ease_of_use)  
3.2.1.2 [���������� � ������������](#security_requirements)  
3.2.2 [������� ����������](#external_interfaces)  

<a name="intro"/>

# 1 ��������

<a name="appointment"/>

## 1.1 ����������
� ���� ��������� ������� �������������� � ���������������� ���������� � web-����� ��� ���������� �Advertsik� �� ������ http-�������. ���� �������� ������������ ��� �������, ������� ����� ������������� � ��������� ������������ ������ �������.

<a name="business_requirements"/>

## 1.2 ������-����������

<a name="initial_data"/>

### 1.2.1 �������� ������
����������� ������ �������� �������, � ���������� �������, ��������� ���� �� �������������� ��� ���� � ������� ����� ��������� ���. � ��� ����� ��� �� ����� � ����������� ����� ������, � ��������� �����, ���� �������� ���������. ��������� ������� ���� �� �������, �� ������ � ����������� ���������� � ������� �� �� ��������. � ����� ������� �� ������ �������� ������. ������, � ��� �� ��� �������, ��� ��� ������ ���������� � ������ �  ��������� �������. � ���� ���� ����, ������� �� � �������� ��������� � ��� ��� ���� �� ������������� �����, �� � ��� ������������ � ������������ �����������.

<a name="business_opportunities"/>

### 1.2.2 ����������� �������
������ ����������� ���� ������ ����� ����, ������� �������� ��������� � ������������� ���������� � �������. �������� ��������-������ �������� �� ���������� ����� � �������� ��� �����-������� ����� � ������ � ������������ �����. 

<a name="project_boundary"/>

### 1.2.3 ������� �������
���� ��� ���������� �Advertsik� �������� ������������������ ������������� ��������� � ������������� ���������� �� ������ �������������. ��� ��������� ������������� ������������� ����������� ��������� ���������� ��� ������� � ���������� ������ ��������.

<a name="analogues"/>

## 1.3 �������

<a name="avito"/>

### 1.3.1 �����
���� �� ����� ������ � ����� ��������� ���������� �������� ��������-�������� � ���������� ������������ � �������� ����������� ����������� �������. ��� ������ 15 ������� 2007 ����. �������� �������� ����� ���������� � ����� ����������. ������ ������ �������� �������� � ����� ����������. � ����� ������������ �������� ������ ������������ ����� ����� ��������. ������, ��� �������� ����������� ��������������� �������, � ��� ������ ������� ��� �������� ���������������. ����� ����������� Avito � ��������� ������� ���������, ������ ��������� ��������� ���������� ����� � �������� ���������� �������. ����� � ������� ������� �����, ��� ������� ������������ ������ �������� ��������, ���� ���������� � �� ��������.
![�����](../../Images/Analogs/avito.png)  

<a name="kufar"/>

### 1.3.2 �����
����� � ����� ��������� � ���������� ������-�������� ���������� ���������� � ��������. ����� �� ������ ��� ������� ���������� � ������� � ������� ����� � �/� �������, ��� � ����������� ���������-��������� ������. ����������� �������� �������� ������� ����������� ������� �������. ���, ����� ������� ������ ���������� �� "�����" ��� �������� ������� �� �������, �������� ����������� "����" - ��� ���������� ������, ���������� ������� ����� ���� �������� ������ ����� ���������� �����. �� ������� ������������� ������� �������� ������ �������������� ���������� ������������, � �� ������ �������� �����.
![�����](../../Images/Analogs/kufar.png)  

<a name="user_requirements"/>

# 2 ���������� ������������

<a name="software_interfaces"/>

## 2.1 ����������� ����������
���� ������������ ������� ������������ �������� ��������� http � ������ ��� ��������� � ���� ������ MySQL. ���������� ����������� �� ��������� Spring Framework.

<a name="user_interface"/>

## 2.2 ��������� ������������
�������� ����������� ������������.  
![�������� ����������� ������������](../../Images/Mockups/authorization.png)  
������� ��������.  
![������� ��������](../../Images/Mockups/mainPage.png)  
�������� �������������� � ������������ ������������.  
![�������� �������������� � ������������ ������������](../../Images/Mockups/myAdsPage.png)  
�������� ���������� ������ ���������� �������������.  
![�������� ���������� ������ ���������� �������������](../../Images/Mockups/addingNewAd.png)  

<a name="user_specifications"/>

## 2.3 �������������� �������������

<a name="user_classes"/>

### 2.3.1 ������ �������������

| ����� ������������� | �������� |
|:---|:---|
| ��������� ������������ | ������������, ������� �� ������������������ �� �����. ����� ��������� ������ � ��������� ���������� ������ �������������. |
| ������������������ ������������ | ������������, ������� �������������� �� ����� � ������� E-mail�� � ������, �������� ������������� � �������� ����������. ����� ������ � ������� ����������� �������. |

<a name="target_audience"/>

### 2.3.2 ������� ���������
���� ����� ���������� ���������, ���������� ����������� ������������ ������������.

<a name="assumptions_and_dependencies"/>

## 2.4 ������������� � �����������
1.	���� �� �������� ��� ���������� ����������� � ���������.
2.	���� �� ������������ ������� � ������� ���������� �������.

<a name="system_requirements"/>

# 3 ��������� ����������

<a name="functional_requirements"/>

## 3.1 �������������� ����������

<a name="main_functions"/>

### 3.1.1 �������� �������

<a name="registration"/>

#### 3.1.1.1 ����������� ������������
��������� ������������ ����� ����������� ������������������ �� �����.

<a name="authorization"/>

#### 3.1.1.2 ����������� ������������������� ������������
������������������ ������������ ����� ����������� ����� � ���� �������.

<a name="view_ads"/>

#### 3.1.1.3 �������� ����������
�������������� � ��������� ������������ ����� ����������� ������������� ���������� ������ �������������. ��������� ������������ �� ����� ������� � ���������� ������ ��������. �������������� ������������ ����� ������ � ������� �����������.

<a name="adding_new_ad"/>

#### 3.1.1.4 ���������� ������ ����������
�������������� ������������ ����� ������� �� ����� ����� ����������.

<a name="view_your_ads"/>

#### 3.1.1.5 �������� ����� ����������
�������������� ������������ ����� ����������� ��������� ����� ����������.

<a name="edit_ads"/>

#### 3.1.1.6 �������������� ����������
�������������� ������������ ����� ����������� �������������� ����� ����������.

<a name="delete_ads"/>

#### 3.1.1.7 �������� ����������
�������������� ������������ ����� ����������� �������� ����� ����������.

<a name="log_out"/>

#### 3.1.1.8 ����� �� ������� ������
������������ ����� ����������� ����� �� ����� ������� ������.

<a name="restrictions_and_exclusions"/>

### 3.1.2 ����������� � ����������
1.	���� �������� ������ ��� ������� ����������� � ���������.
2.	���� �� ������������ ������� � ������� ���������� �������.

## 3.2 ���������������� ����������

<a name="quality_attributes"/>

### 3.2.1 �������� ��������

<a name="requirements_for_ease_of_use"/>

#### 3.2.1.1 ���������� � �������� �������������
1.	��� �������������� �������� ����������������� ���������� ����� ��������, ����������� ��������, ������� ���������� ��� ������ ��������;
2.	��������� ���������� ������������� �������� ������� ����� ���������� � �������.

<a name="security_requirements"/>

#### 3.2.1.2 ���������� � ������������
������ ������������� ����������� �������������� ���������� ������ ��������������� ������������.
����������� ��������� ���������� ������ �������� ������ ������������������ �������������.

<a name="external_interfaces"/>

### 3.2.2 ������� ����������
1.	������ ������ �� ����� 14��;
2.	�������������� �������� ���������� ����;
3.	�������� � ������� ��������� ���������� �������� ��������� �� ����������.




