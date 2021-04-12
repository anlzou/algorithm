import time

def countPrimes(n):
    # 二维列表，保存答案
    isPrim = [[i, True] for i in range(n)]

    for i in range(2, n):
        # i*i < n 即为 i < sqrt(n)，只不过我们需要遍历所有i
        if i*i < n and isPrim[i][1] is True:
            j = i*i
            while(j<n):
                isPrim[j][1] = False
                j = i+j

    count = 0
    for i in range(2, n):
        if isPrim[i][1]:
            count += 1    

    return count,isPrim[2:]




####################test#######################
if __name__ == "__main__":
    n = 1000000
    print("[2," + str(n) + ")")

    start = time.time()
    count, listData = countPrimes(n)
    end = time.time()
    passtime = end-start

    print("count primes: " + str(count), end="\n")
    print("pass time: " + str(passtime), end="\n")
    print("last one: " + str(listData[-1:]))

