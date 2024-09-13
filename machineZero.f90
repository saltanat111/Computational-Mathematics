program mach_zero
    implicit none

    double precision :: mz
    integer :: n
    double precision :: temp

    mz = 1.0d0
    n = 0

    do while (mz * 2.0d0 > mz)
        temp = mz * 2.0d0
        if (temp /= mz) then
            print *, mz
        end if
        mz = mz / 2.0d0
        n = n + 1
    end do

    print *, mz
    print *, n

end program mach_zero