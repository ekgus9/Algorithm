'''
유클리드 알고리즘 
    : 주어진 두 수 사이 존재하는 최대공약수 GCD 구하는 알고리즘
        GCD greatest common divisor
        
원리
    1. 임의의 두 자연수 a, b 중 큰 값 a
    2. a를 b로 나눈 나머지를 n (a%b=n)
    3. n이 0일때 최대 공약수
'''

a = 16
b = 8
a1,b1 = a,b

if b > a : # 1
    tmp = a
    a = b
    b = tmp
    
while b != 0 :
    n = a % b
    a = b
    b = n
    
print('{}와 {}의 최대공약수 : {}'.format(a1,b1,a))


# + 최소공배수 구하기
    # a와 b의 곱을 최대공약수로 나눈 것
    
s = int((a1 * b1) / a)

print('{}와 {}의 최소공배수 : {}'.format(a1,b1,s))