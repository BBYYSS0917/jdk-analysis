## 8 basic data type
## cache pool
the differences between Integer.valueOf(123) and
  new Integer(123)
### String
String is not changeable.
advantages:
1. cache hash
2. String Pool
3. Safety
4. Thread Safe

#### String,StringBuilder,StringBuffer
StringBuffer use synchronized to implement Thread Safe.

### String.intern()
Basically doing String.intern() on a series of strings will ensure that all strings having same contents share same memory.

Update: Interned strings are stored in main heap from Java 7 onwards.

## Compute
```
float f=1.1f
double d=1.1

---- 
Until today, I thought that for example:

i += j;
Was just a shortcut for:

i = i + j;
But if we try this:

int i = 5;
long j = 8;
Then i = i + j; will not compile but i += j; will compile fine.

Does it mean that in fact i += j; is a shortcut for something like this i = (type of i) (i + j)?
```

## Switch
## Inheritance
- Access Rights
- Abstract Class & Interface
- super
- Override & Overload

## Object common methods
- equals
- hashcode
- toString
- clone -- better not use it

## keyword
- final
- static
