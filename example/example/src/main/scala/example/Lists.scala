package example


object Lists:
  /** This method returns a list of numbers obtained from the original list of integers.
   *
   * @param xs - A list of integer numbers
   * @return The list of doubled integers
   */
  def doubledNums(xs: List[Int]): List[Int] = ???

  /** This method returns a list of integers with only elements which hold true the predicate p.
   * If the list xs is empty the result also has to be empty.
   * You can use for-comprehension for looping through the list and probably you will need if-guardian in generator
   *
   * @param xs A list of integers
   * @param p  function Int => Boolean, use it for filtering the list elements
   * @return The list of elements from the xs which hold the predicate p as true
   * */
  def filter(xs: List[Int], p: Int => Boolean): List[Int] = ???

  /**
   * This method computes the sum of all elements in the list xs. There are
   * multiple techniques that can be used for implementing this method, and
   * you will learn during the class.
   *
   * For this example assignment you can use the following methods in class
   * `List`:
   *
   *  - `xs.isEmpty: Boolean` returns `true` if the list `xs` is empty
   *  - `xs.head: Int` returns the head element of the list `xs`. If the list
   *    is empty an exception is thrown
   *  - `xs.tail: List[Int]` returns the tail of the list `xs`, i.e. the the
   *    list `xs` without its `head` element
   *
   * ''Hint:'' instead of writing a `for` or `while` loop, think of a recursive
   * solution.
   * OR you may also use the fold method of class List or even simple sum method.
   *
   * @param xs A list of natural numbers
   * @return The sum of all elements in `xs`
   */
  def sum(xs: List[Int]): Int = ???

  /**
   * This method looks like the precious one, but the difference is the list can contain
   * not only the integer numbers (presented with type Some[Int]) but also non-existent
   * numbers (presented by None). Both this types Some and None are inherited from the
   * monadic type Option
   * The task is the same to calculate the sum of the all presented integer numbers and
   * skip all nones.
   * ''Hint: '' you may use the for-comprehension with two generators to filter out all
   * None instances and then just summarise the list elements with method sum.
   *
   * @param xs list of integers wrapped into Option monad type.
   * @return the sum of the presented by Some integers.
   */
  def sumOptList(xs: List[Option[Int]]): Int = ???

  /**
   * This method returns the largest element in a list of integers. If the
   * list `xs` is empty it throws a `java.util.NoSuchElementException`.
   *
   * You can use the same methods of the class `List` as mentioned above.
   *
   * ''Hint:'' Again, think of a recursive solution instead of using looping
   * constructs. You might need to define an auxiliary method.
   *
   * @param xs A list of natural numbers
   * @return The largest element in `xs`
   * @throws java.util.NoSuchElementException if `xs` is an empty list
   */
  def max(xs: List[Int]): Int = ???

  /**
   * This method produce the sum of the two integer numbers presented as part of
   * the string input of the following example "2 + 3". The result must be equal 3.
   * Both parameter and the result have to be put into the Option type as there is no
   * restriction on the input string pattern. For any other pattern except "x + y" where
   * x and y are the sequence of number symbols with optional leading symbol '-' (for negative numbers)
   * the result must be None
   *
   * In this task you may need to use the type scala.util.matching.Regex and combination with
   * for-comprehension of pattern matching.
   *
   * ''Hint:'' proper regular expression for the task could be <b>(-?\d+) \+ (-?\d+)</b>
   *
   * @param xo optional string with input data, could be proper math sum or any other symbolic sequence.
   * @return the Some of sum of two integer numbers if the xo matches the pattern or None otherwise
   */
  def sumOptString(xo: Option[String]): Option[Int] = ???
    
  /**
   * This method produces the list of sizes of non-empty list in the parameter.
   * For all non-empty lists of integers the resulting list has to contain the size of them.
   * Use for-comprehension or map and filter methods of List type.
   *
   * ''Hint:'' in generator of for-comprehension you may add pattern match in addition to name of
   * generated value like this 'list @ head :: tail'. This means the generated value of original
   * sequence need to be the type of list with at least one element named head and the rest named tail.
   *
   * @param xs list of lists of integers. Some of them can be empty lists presented with List() or
   *           List.empty or Nil
   * @return the list of sizes of non-empty lists. All empty list must be skipped.
   */
  def sizeOfNonemptyLists(xs: List[List[Int]]): List[Int] = ???