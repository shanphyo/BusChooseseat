package com.mic.busproject

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_ticket.*


class TicketFragment : Fragment() {
    var buyticktet: String = "A1/A2/A3/"
    var selectedticket: String = ""



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ticket, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        databaseSeat()
        btn_A1.setOnClickListener {
            var t: String = "A1"
            var st = CheckSeat(t)
            if (st) {

            } else {
                userclick(t)
            }
        }
        btn_A2.setOnClickListener {
            var t: String = "A2"
            var st = CheckSeat(t)
            if (st) {

            } else {
                userclick(t)
            }
        }
        btn_A3.setOnClickListener {
            var t: String = "A3"
            var st = CheckSeat(t)
            if (st) {

            } else {
                userclick(t)
            }
        }
        btn_A4.setOnClickListener {
            var t: String = "A4"
            var st = CheckSeat(t)
            if (st) {

            } else {
                userclick(t)
            }
        }
        btn_A5.setOnClickListener {
            var t: String = "A5"
            var st = CheckSeat(t)
            if (st) {

            } else {
                userclick(t)
            }
        }
        btn_A6.setOnClickListener {
            var t: String = "A6"
            var st = CheckSeat(t)
            if (st) {

            } else {
                userclick(t)
            }
        }


    }

    fun databaseSeat() {
        var bticket = buyticktet.split("/")
        bticket.forEach() {
            if (it.equals("A1")) {
                btn_A1.setBackgroundColor(Color.RED)
                btn_A1.isEnabled=false
            } else if (it.equals("A2")) {
                btn_A2.setBackgroundColor(Color.RED)
                btn_A2.isEnabled=false
            } else if (it.equals("A3")) {
                btn_A3.setBackgroundColor(Color.RED)
                btn_A3.isEnabled=false
            } else if (it.equals("A4")) {
                btn_A4.setBackgroundColor(Color.RED)
                btn_A4.isEnabled=false
            } else if (it.equals("A5")) {
                btn_A5.setBackgroundColor(Color.RED)
                btn_A5.isEnabled=false
            } else if (it.equals("A6")) {
                btn_A6.setBackgroundColor(Color.RED)
                btn_A6.isEnabled=false
            }
        }
    }

    fun userclick(t: String) {
        if (t.equals("A1")) {
            btn_A1.setBackgroundColor(Color.YELLOW)
            selectedticket = selectedticket + t + "/"
        } else if (t.equals("A2")) {
            btn_A2.setBackgroundColor(Color.YELLOW)
            selectedticket = selectedticket + t + "/"
        } else if (t.equals("A3")) {
            btn_A3.setBackgroundColor(Color.YELLOW)
            selectedticket = selectedticket + t + "/"
        } else if (t.equals("A4")) {
            btn_A4.setBackgroundColor(Color.YELLOW)
            selectedticket = selectedticket + t + "/"
        } else if (t.equals("A5")) {
            btn_A5.setBackgroundColor(Color.YELLOW)
            selectedticket = selectedticket + t + "/"
        } else if (t.equals("A6")) {
            btn_A6.setBackgroundColor(Color.YELLOW)
            selectedticket = selectedticket + t + "/"
        }

    }

    fun CheckSeat(t: String): Boolean {
        var status: Boolean = false
        var r = selectedticket.split("/")
        if (t.equals("A1")) {
            r.forEach() {
                if (it.equals("A1")) {
                    btn_A1.setBackgroundColor(Color.GREEN)
                    selectedticket = selectedticket.replace("A1/", "")
                    status = true
                }
            }
        } else if (t.equals("A2")) {
            r.forEach() {
                if (it.equals("A2")) {
                    btn_A2.setBackgroundColor(Color.GREEN)
                    selectedticket = selectedticket.replace("A2/", "")
                    status = true

                }
            }
        } else if (t.equals("A3")) {
            r.forEach() {
                if (it.equals("A3")) {
                    btn_A3.setBackgroundColor(Color.GREEN)
                    selectedticket = selectedticket.replace("A3/", "")
                    status = true
                }
            }
        } else if (t.equals("A4")) {
            r.forEach() {
                if (it.equals("A4")) {
                    btn_A4.setBackgroundColor(Color.GREEN)
                    selectedticket = selectedticket.replace("A4/", "")
                    status = true
                }
            }
        } else if (t.equals("A5")) {
            r.forEach() {
                if (it.equals("A5")) {
                    btn_A5.setBackgroundColor(Color.GREEN)
                    selectedticket = selectedticket.replace("A5/", "")
                    status = true
                }
            }
        } else if (t.equals("A6")) {
            r.forEach() {
                if (it.equals("A6")) {
                    btn_A6.setBackgroundColor(Color.GREEN)
                    selectedticket = selectedticket.replace("A6/", "")
                    status = true
                }
            }

        }
        return status


    }
}