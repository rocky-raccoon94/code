def avg (*nums):
    res = 0
    for num in nums:
        res+=num
    return (res+0.0)/len(nums)
    
print(avg(1, 2, 2))