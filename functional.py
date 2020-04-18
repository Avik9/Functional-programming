from functools import reduce

'''                          2.1 Recursion in Python                    '''


# 2.1.1:
def flatten(toFlatten: list) -> list:
    if len(toFlatten) == 0 or toFlatten is None:
        return []

    elif type(toFlatten[0]) == list:
        return flatten(toFlatten[0]) + flatten(toFlatten[1:])

    else:
        return [toFlatten[0]] + flatten(toFlatten[1:])


# 2.1.2:
def reverse(toReverse: list) -> list:
    if len(toReverse) == 0 or toReverse is None:
        return []

    ans = []

    for x in toReverse:

        if type(x) == list:
            ans.append(reverse(x))

        else:
            ans.append(x)

    ans.reverse()

    return ans


# 2.1.3:
def compress(toCompress: list) -> list:
    if len(toCompress) < 2 or toCompress is None:
        return toCompress

    first = toCompress[0]
    second = toCompress[1]

    if first == second:
        return compress(toCompress[1:])

    else:
        return [first] + (compress(toCompress[1:]))


# Test cases:

lst = [[1, 2, [3, 4]], [9, [5, 6]], 7]

result = flatten(lst)
print("\nResult of flatten: ")
print("Original: " + str(lst))
print("Result: " + str(result))

lst = [[1, 2], [3, [4, 5]], 6]

result = reverse(lst)
print("\nResult of reversed: ")
print("Original: " + str(lst))
print("Result: " + str(result))

print("\nResult of compress: ")
result = compress([1, 1, 5, 4, 4, 6, 3, 3, 3, 8, 7, 7])
print("Original: " + str([1, 1, 5, 4, 4, 6, 3, 3, 3, 8, 7, 7]))
print("Result: " + str(result))

'''                          2.2 Higher-order functions                         '''


# 2.2.1:
def capitalized(items: list) -> list:
    return list(filter(lambda x: x[0].isupper(), items))


# 2.2.2:
def longest(strings: list, from_start=True) -> object:
    return str(reduce(lambda x, y: x if len(x) >= len(y) else y, strings) if from_start else reduce(
        lambda x, y: x if len(x) > len(y) else y, strings))


# 2.2.3:
def composition(f, g) -> object:
    return lambda x: f(g(x))


# 2.2.4:
def n_composition(*functions) -> object:
    # def composition(f, g) -> object:
    #     return lambda x: f(g(x))
    return reduce(composition, functions, lambda x: x)


# Test code:

lst = ["Avik", "avik", "Samarpan", "samarpan", "Atharva", "athArva", "atharVa", "atharva", "Gaurav", "gaurav", "Max",
       "max", "Nafi", "nafi"]

returnedList = capitalized(lst)


print("\nThe capitalized strings are: ")

for x in returnedList:
    print(x)

returnedString = longest(lst)


print("\nThe longest string with from_start: ")

print(returnedString)

returnedString = longest(lst, False)


print("\nThe longest string with not from_start: ")

print(returnedString)


print("\nThe composition function with longest and capitalized: ")

y = composition(longest, capitalized)

p = y(lst)

print(p)


print("\nThe composition function with flatten and reverse: ")

lst = [[1, 2, [3, 4]], [9, [5, 6]], 7]

y = composition(flatten, reverse)

p = y(lst)

print(p)


print("\nThe n_composition function with flatten, reverse, and compress: ")

lst = [[1, 1, 2, [3, 4]], [9, 5, [5, 6, 6]], 7]

y = n_composition(compress, flatten, reverse)

p = y(lst)

print(p)
