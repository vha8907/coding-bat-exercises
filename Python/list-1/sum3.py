#Given an array of ints length 3, return the sum of all the elements.

# Simple solution (uses in-built sum function):
def sum3(nums):
  return sum(nums)

# Manual implementation:
def sum3(nums):
  sumOfList = 0
  for i in range(len(nums)):
    sumOfList += nums[i]
  return sumOfList