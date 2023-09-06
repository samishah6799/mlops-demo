from main import Bulb

bulb = Bulb()

def test_bulb_status():
    assert bulb.getStatus() == "Bulb is not glowing"
