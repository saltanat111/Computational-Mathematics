program machInf
    implicit none
    real*8 :: mi
    integer :: n

    mi = 2.0d0
    n = 0

    do while (mi /= mi * 2.0d0)
        mi = mi * 2.0d0
        n = n + 1
        if (mi /= mi * 2.0d0) then
            print *, mi
        end if
    end do

    print *, mi
    print *, n
end program machInf